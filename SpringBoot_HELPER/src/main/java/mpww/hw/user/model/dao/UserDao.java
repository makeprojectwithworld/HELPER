package mpww.hw.user.model.dao;

import mpww.hw.user.model.dto.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    int signUp(User user);

    User login(User user);

}
