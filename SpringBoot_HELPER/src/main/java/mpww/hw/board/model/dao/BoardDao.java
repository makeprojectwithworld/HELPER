package mpww.hw.board.model.dao;

import mpww.hw.board.model.dto.SearchCondition;
import mpww.hw.board.model.dto.Board;

import java.util.List;

public interface BoardDao {
    List<Board> selectAll();

    int writeBoard(Board board);

    List<Board> searchByCondition(SearchCondition con);

    int deleteBoard(int id);

    int updateBoard(Board updateBoard);
}
