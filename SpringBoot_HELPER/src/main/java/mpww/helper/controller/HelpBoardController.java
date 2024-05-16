package mpww.helper.controller;

import mpww.helper.domain.helpboard.model.service.HelpBoardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helpboardapi/")
public class HelpBoardController {

    private final HelpBoardService helpBoardService;

    public HelpBoardController(HelpBoardService helpBoardService) {
        this.helpBoardService = helpBoardService;
    }

}
