package mpww.helper.controller;


import mpww.helper.domain.user.model.dto.User;
import mpww.helper.domain.user.model.service.UserService;
import mpww.helper.global.util.JwtUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
//            String token = jwt.createToken(user.getId());
            Map<String, Object> map = new HashMap<>();
//            map.put("access-token",token);
            map.put("user", loginUser);
            return new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
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
