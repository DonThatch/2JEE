package com.supinfo.footballeague.interfaces;

import com.supinfo.footballeague.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}