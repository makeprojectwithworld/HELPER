package mpww.hw.board.model.service;


import mpww.hw.board.model.dto.Board;
import mpww.hw.board.model.dto.SearchCondition;

import java.util.List;

public interface BoardService {
    int removeBoard(int id);
    List<Board> selectAll();
    List<Board> searchByCondition(SearchCondition con);
    int updateBoard(Board updateBoard);
    int writeBoard(Board board);
}
