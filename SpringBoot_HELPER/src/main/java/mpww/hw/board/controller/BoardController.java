package mpww.hw.board.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import mpww.hw.board.model.dto.Board;
import mpww.hw.board.model.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Board", description = "게시글 관리")
@RestController
@RequestMapping("/boardapi")
@CrossOrigin(origins = "*")
public class BoardController {
    @Autowired
    BoardService boardService;


    @Operation(summary = "전체 게시글 조회", description = "전체 게시글을 조회합니다")
    @GetMapping("/board")
    public ResponseEntity<?> selectAll(){
        List<Board> boardList = boardService.selectAll();

        if(!boardList.isEmpty()){
            return ResponseEntity.ok(boardList);
        }
        return ResponseEntity.noContent().build();
    }
    @Operation(summary = "게시글 삭제하기", description = "해당 게시글을 삭제합니다")
    @DeleteMapping("/board/{id}")
    public ResponseEntity<?> remove(@PathVariable int id){
        int result = boardService.removeBoard(id);
        return new ResponseEntity<>(result, result == 1 ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "게시글 수정하기", description = "해당 게시글을 수정합니다")
    @PutMapping("/board/{id}")
    public ResponseEntity<?> update(@PathVariable int id, @RequestBody Board updatedBoard){
        updatedBoard.setboardId(id);
        int result  = boardService.updateBoard(updatedBoard);
        return new ResponseEntity<>(result,result ==1 ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

    @Operation(summary = "게시글 작성하기", description = "새로운 게시글을 작성합니다")
    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Board board){
        int result = boardService.writeBoard(board);

        return new ResponseEntity<>(result, result == 1 ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

}
