package mpww.helper.domain.user.model.service;

import mpww.helper.domain.user.model.dto.User;

public interface UserService {
    int signUp(User user);

    User login(User user);
    
}
