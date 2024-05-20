package mpww.helper.domain.board.comment.model.service;


import lombok.AllArgsConstructor;
import mpww.helper.domain.board.comment.model.dao.CommentDao;
import mpww.helper.domain.board.comment.model.dto.CommentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService{


    private final CommentDao commentDao;

    @Override
    public int removeComment(int seq) {
        return commentDao.removeComment(seq);
    }

    @Override
    public int addComment(CommentDto comment) {
        return commentDao.addComment(comment);
    }

    @Override
    public int updateComment(CommentDto comment) {
        return commentDao.updateComment(comment);
    }

    @Override
    public List<CommentDto> SelectAll(int boardSeq) {
        return commentDao.getComments(boardSeq);
    }
}
