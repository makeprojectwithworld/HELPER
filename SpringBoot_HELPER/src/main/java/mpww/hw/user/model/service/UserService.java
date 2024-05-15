package mpww.hw.user.model.service;

import mpww.hw.user.model.dto.User;

public interface UserService {
    int signUp(User user);

    User login(User user);
    
}
