package mpww.helper.domain.user.model.dto;


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

    public int getHelperIndex() {
        return helperIndex;
    }

    public void setHelperIndex(int helperIndex) {
        this.helperIndex = helperIndex;
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public String getBirthdate() {
        return birthDate;
    }

    public void setBirthdate(String birthdate) {
        this.birthDate = birthdate;
    }

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }
    public User() { }

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


}
