package mpww.helper.global.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
@Component
public class JwtUtil {
    private String SALT = "SSAFY_JavaTrack_Project_Helper_SecretKey";
    private SecretKey secretKey = Keys.hmacShaKeyFor(SALT.getBytes(StandardCharsets.UTF_8));

    public String createToken(String id){
        Date exp = new Date(System.currentTimeMillis() + 1000*60*60);
        return Jwts.builder().header().add("typ","JWT").and().claim("id",id).expiration(exp).signWith(secretKey).compact();
    }

    public Jws<Claims> validate(String token){

        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token);
    }
}
