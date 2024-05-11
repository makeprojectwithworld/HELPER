package mpww.hw.controller;


import mpww.hw.model.dto.User;
import mpww.hw.model.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/boardapi")
@CrossOrigin(origins = "*")
public class BoardController {
    @Autowired
    BoardService us;

    @GetMapping("/board")
    public ResponseEntity<?> selectAll(){
        try{
            List<User> users = us.
        }
    }
}
