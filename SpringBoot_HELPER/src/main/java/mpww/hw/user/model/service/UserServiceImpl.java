package mpww.hw.user.model.service;

import mpww.hw.user.model.dao.UserDao;
import mpww.hw.user.model.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public int signUp(User user) {

        return 0;
    }

    @Override
    public User login(User user) {

        return null;
    }
}
