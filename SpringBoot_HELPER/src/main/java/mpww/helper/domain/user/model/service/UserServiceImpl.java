package mpww.helper.domain.user.model.service;

import mpww.helper.domain.user.common.request.auth.IdCheckRequestDto;
import mpww.helper.domain.user.common.response.ResponseDto;
import mpww.helper.domain.user.common.response.auth.IdCheckResponseDto;
import mpww.helper.domain.user.model.dao.UserDao;
import mpww.helper.domain.user.model.dto.User;
import mpww.helper.global.util.JwtUtil;
import org.springframework.http.ResponseEntity;
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

    @Override
    public ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto) {


        try{
            String userId = dto.getId();
            boolean isExisted = userDao.existsByUserId(userId);

            if(isExisted) return IdCheckResponseDto.dupicateId();

        } catch (Exception exception){
            exception.printStackTrace();
            return ResponseDto.databaseError();
        }

        return IdCheckResponseDto.success();
    }
}