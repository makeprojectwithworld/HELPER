package mpww.helper.domain.user.model.service;


import jakarta.servlet.http.HttpServletResponse;
import mpww.helper.domain.user.model.dto.User;
import mpww.helper.global.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class KaKaoUserService {
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    @Autowired
    public KaKaoUserService(PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }


}
