package mpww.hw.user.controller;


import io.jsonwebtoken.Jwt;
import mpww.hw.user.model.dto.User;
import mpww.hw.user.model.service.UserService;
import mpww.hw.user.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/userapi")

public class UserController {

    private final JwtUtil jwt;
    private final UserService userService;

    public UserController(JwtUtil jwt, UserService userService){
        this.jwt = jwt;
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user){
        User loginUser = userService.login(user);

        if(loginUser != null){
            String token = jwt.createToken(user.getId());
            Map<String, Object> map = new HashMap<>();
            map.put("access-token",token);
            map.put("user", user);
            return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody User user){
        int result = userService.signUp(user);
        if(result == 1){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
