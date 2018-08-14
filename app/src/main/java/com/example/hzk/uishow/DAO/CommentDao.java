package com.example.hzk.uishow.DAO;

import com.example.hzk.uishow.ENTITY.Comment;

import java.util.ArrayList;

public interface CommentDao {
    public ArrayList<Comment> getCommentByShopID(String shopID);
    public boolean insertComment(Comment comment);
}
