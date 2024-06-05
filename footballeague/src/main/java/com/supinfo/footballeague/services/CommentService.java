package com.supinfo.footballeague.services;

import com.supinfo.footballeague.entity.Comment;

import java.util.List;

public interface CommentService {
    Comment saveComment(Comment comment);
    List<Comment> getAllComments();
    Comment getCommentById(Long id);
    Comment addCommentToMatch(Long matchId, Comment comment);
    void deleteComment(Long id);
}