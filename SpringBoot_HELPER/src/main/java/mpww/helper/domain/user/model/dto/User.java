package mpww.helper.domain.user.model.dto;

public class User {
    private String id;
    private String password;
    private String nickname;
    private String email;
    private String sex;
    private int helper_index;
    private int workout_grass;
    private String accessToken;

    public User(String id, String password, String nickname, String email, String sex, String accessToken) {
        this.id = id;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.sex = sex;
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", helper_index=" + helper_index +
                ", workout_grass=" + workout_grass +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public int getHelper_index() {
        return helper_index;
    }

    public void setHelper_index(int helper_index) {
        this.helper_index = helper_index;
    }


    public int getWorkout_grass() {
        return workout_grass;
    }

    public void setWorkout_grass(int workout_grass) {
        this.workout_grass = workout_grass;
    }
}
