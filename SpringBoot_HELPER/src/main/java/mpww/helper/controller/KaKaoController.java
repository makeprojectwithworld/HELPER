package mpww.helper.controller;


import io.swagger.v3.oas.annotations.Operation;
import mpww.helper.domain.user.model.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KaKaoController {
    private final UserService userService;

    public KaKaoController(UserService userService) {
        this.userService = userService;
    }


}
