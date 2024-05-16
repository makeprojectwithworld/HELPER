package mpww.helper.domain.board.model.dao;

import mpww.helper.domain.board.model.dto.Board;
import mpww.helper.domain.board.model.dto.SearchCondition;

import java.util.List;

public interface BoardDao {
    List<Board> selectAll();

    int writeBoard(Board board);

    List<Board> searchByCondition(SearchCondition con);

    int deleteBoard(int id);

    int updateBoard(Board updateBoard);
}
