package mpww.helper.domain.user.model.dao;

import mpww.helper.domain.user.model.dto.CertificationInfo;
import mpww.helper.domain.user.model.dto.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    int signUp(User user);

    User login(User user);

    boolean existsByUserId(String userId);

    void saveCertificationInfo(CertificationInfo info);

    boolean existsByEmail(String email);
}
