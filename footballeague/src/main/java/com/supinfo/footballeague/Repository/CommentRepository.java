package com.supinfo.footballeague.Repository;// CommentRepository.java
import com.supinfo.footballeague.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}