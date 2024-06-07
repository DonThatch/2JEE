package com.supinfo.footballeague.controller;

import com.supinfo.footballeague.entity.Comment;
import com.supinfo.footballeague.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/{matchId}")
    public ResponseEntity<Comment> addCommentToMatch(@PathVariable Long matchId, @RequestBody Comment comment) {
        Comment savedComment = commentService.addCommentToMatch(matchId, comment);
        return ResponseEntity.ok(savedComment);
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable Long id) {
        return commentService.getCommentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }
}