package mpww.helper.domain.user.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String id;
    private String password;
    private String nickname;
    private String email;
    private String birthDate;
    private String sex;
    private int helperIndex;
    private String accessToken;
    private String gymName;
    private String refreshToken;


    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public User(String id, String password, String email){
        this.id = id;
        this.password = password;
        this.email = email;
    }


}
