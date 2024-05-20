package mpww.helper.domain.user.model.service;

import mpww.helper.domain.user.common.request.auth.EmailCertificationRequestDto;
import mpww.helper.domain.user.common.request.auth.IdCheckRequestDto;
import mpww.helper.domain.user.common.response.auth.EmailCertificationResponseDto;
import mpww.helper.domain.user.common.response.auth.IdCheckResponseDto;
import mpww.helper.domain.user.model.dto.User;
import org.springframework.http.ResponseEntity;


public interface UserService {
    int signUp(User user);

    User login(User user);

    ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto);

    ResponseEntity<? super EmailCertificationResponseDto> emailCertification(EmailCertificationRequestDto dto);


}
