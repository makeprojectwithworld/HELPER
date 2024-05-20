package mpww.helper.domain.board.post.model.dao;

import mpww.helper.domain.board.post.model.dto.Board;
import mpww.helper.domain.board.post.model.dto.SearchCondition;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BoardDao {
    List<Board> selectAll(String gymName);

    int writeBoard(Board board);

    List<Board> searchByCondition(SearchCondition con);

    int deleteBoard(int id);

    int updateBoard(Board updateBoard);
}
