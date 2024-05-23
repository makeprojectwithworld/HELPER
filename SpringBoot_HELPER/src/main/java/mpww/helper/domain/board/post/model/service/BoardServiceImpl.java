package mpww.helper.domain.board.post.model.service;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import mpww.helper.domain.board.post.model.dao.BoardDao;
import mpww.helper.domain.board.post.model.dto.Board;
import mpww.helper.domain.board.post.model.dto.SearchCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements  BoardService {

    private final BoardDao boardDao;



    @Override
    public int removeBoard(int id) {
        return boardDao.deleteBoard(id);
    }

    @Override
    public List<Board> selectAll() {
        return boardDao.selectAll();
    }

    @Override
    public List<Board> searchByCondition(SearchCondition con) {
        return boardDao.searchByCondition(con);
    }

    @Override
    public int updateBoard(Board updateBoard) {
        return boardDao.updateBoard(updateBoard);
    }

    @Override
    public void writeBoard(Board board, String userNickname, String GymName) {
        board.setUserNickname(userNickname);
        board.setGymName(GymName);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        board.setRegistDate(new Date(String.valueOf(formatter)));
        System.out.println(userNickname);
        boardDao.writeBoard(board);
    }

    @Override
    public Board getBoard(int seq) {
        return boardDao.selectBoard(seq);
    }


}


