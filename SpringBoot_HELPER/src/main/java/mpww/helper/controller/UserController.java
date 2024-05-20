package mpww.helper.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import mpww.helper.domain.user.common.request.auth.EmailCertificationRequestDto;
import mpww.helper.domain.user.common.request.auth.IdCheckRequestDto;
import mpww.helper.domain.user.common.response.auth.EmailCertificationResponseDto;
import mpww.helper.domain.user.common.response.auth.IdCheckResponseDto;
import mpww.helper.domain.user.model.dto.User;
import mpww.helper.domain.user.model.service.UserService;
import mpww.helper.global.util.JwtUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Tag(name = "User", description = "회원 관리")
@RestController
@RequestMapping("/userapi")

public class UserController {

    private final JwtUtil jwt;
    private final UserService userService;

    public UserController(JwtUtil jwt, UserService userService){
        this.jwt = jwt;
        this.userService = userService;
    }

    @Operation(summary = "로그인 기능", description = "데이터베이스에 유저가 저장되어 있을 시 로그인")
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

    @Operation(summary = "회원가입 기능", description = "새로운 회원을 등록합니다")
    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody User user){
        int result = userService.signUp(user);
        if(result == 1){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "아이디 중복 체크", description = "중복된 아이디가 있는 지 체크합니다")
    @PostMapping("/id-check")
    public ResponseEntity<? super IdCheckResponseDto> idCheck(
            @RequestBody IdCheckRequestDto requestBody){

        ResponseEntity<? super IdCheckResponseDto> response = userService.idCheck(requestBody);
        return response;
    }

    @Operation(summary = "이메일 인증", description = "입력된 이메일로 인증 정보를 부여합니다.")
    @PostMapping("/email-cerification")
    public ResponseEntity<? super EmailCertificationResponseDto> emailCertification(
            @RequestBody EmailCertificationRequestDto requestBody){

        ResponseEntity<? super EmailCertificationResponseDto> responseDto = userService.emailCertification(requestBody);

        return responseDto;
    }

}
