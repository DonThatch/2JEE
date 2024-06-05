package com.supinfo.footballeague.interfaces;

import com.supinfo.footballeague.entity.Comment;

import java.util.List;

public interface CommentService {
    Comment saveComment(Comment comment);
    List<Comment> getAllComments();
    Comment getCommentById(Long id);
    void deleteComment(Long id);
}