package mpww.hw.board.model.dto;

import java.util.Date;

public class Board {
    private int boardId;
    private String userId;
    private String title;
    private String content;
    private Date registDate;
    private int likes;
    private int viewCnt;

    public int getboardId() {
        return boardId;
    }

    public void setboardId(int board_Id) {
        this.boardId = board_Id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegist_date() {
        return registDate;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViewcnt() {
        return viewCnt;
    }

    public void setViewcnt(int viewcnt) {
        this.viewCnt = viewcnt;
    }
}
