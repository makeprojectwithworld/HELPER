package mpww.helper.domain.board.model.service;


import mpww.helper.domain.board.model.dao.BoardDao;
import mpww.helper.domain.board.model.dto.Board;
import mpww.helper.domain.board.model.dto.SearchCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements  BoardService {

    private BoardDao boardDao;

    @Autowired
    public void setBoardRepo(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Override
    public int removeBoard(int id) {
        return boardDao.deleteBoard(id);
    }

    @Override
    public List<Board> selectAll(String gymName) {
        return boardDao.selectAll(gymName);
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
    public int writeBoard(Board board) {
        return boardDao.writeBoard(board);
    }


}


