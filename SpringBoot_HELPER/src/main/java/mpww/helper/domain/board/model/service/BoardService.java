package mpww.helper.domain.board.model.service;


import mpww.helper.domain.board.model.dto.Board;
import mpww.helper.domain.board.model.dto.SearchCondition;
import org.springframework.stereotype.Service;

import java.util.List;
public interface BoardService {
    int removeBoard(int id);
    List<Board> selectAll();
    List<Board> searchByCondition(SearchCondition con);
    int updateBoard(Board updateBoard);
    int writeBoard(Board board);
}
