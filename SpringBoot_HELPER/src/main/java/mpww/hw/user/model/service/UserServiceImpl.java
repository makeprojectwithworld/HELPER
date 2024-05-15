package mpww.hw.user.model.service;

import mpww.hw.user.model.dao.UserDao;
import mpww.hw.user.model.dto.User;
import mpww.hw.user.util.JwtUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;
    private final JwtUtil jwtUtil;

    public UserServiceImpl(UserDao userDao, JwtUtil jwtUtil) {
        this.userDao = userDao;
        this.jwtUtil = jwtUtil;
    }


    @Transactional
    @Override
    public int signUp(User user) {
        return userDao.signUp(user);
    }

    @Override
    public User login(User user) {
        User loginUser = userDao.login(user);
        if(loginUser != null) {
            loginUser.setAccessToken(jwtUtil.createToken(loginUser.getId()));

        }
        return loginUser;
    }
}