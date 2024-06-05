package com.supinfo.footballeague.servicesImpl;

import com.supinfo.footballeague.Repository.CommentRepository;
import com.supinfo.footballeague.Repository.MatchRepository;
import com.supinfo.footballeague.entity.Comment;
import com.supinfo.footballeague.entity.Match;
import com.supinfo.footballeague.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private MatchRepository matchRepository;

    @Override
    public Comment addCommentToMatch(Long matchId, Comment comment) {
        Match match = matchRepository.findById(matchId).orElseThrow(() -> new RuntimeException("Match not found"));
        comment.setMatch(match);
        return commentRepository.save(comment);
    }

    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}