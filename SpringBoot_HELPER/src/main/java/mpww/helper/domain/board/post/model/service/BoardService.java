package mpww.helper.domain.board.post.model.service;


import mpww.helper.domain.board.post.model.dto.Board;
import mpww.helper.domain.board.post.model.dto.SearchCondition;

import java.util.List;
public interface BoardService {
    int removeBoard(int id);
    List<Board> selectAll();
    List<Board> searchByCondition(SearchCondition con);
    int updateBoard(Board updateBoard);
    int writeBoard(Board board);

    Board getBoard(int id);
}
