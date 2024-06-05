package com.supinfo.footballeague.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "comment")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comment_seq")
    @SequenceGenerator(name = "comment_seq", allocationSize = 1, initialValue = 100)
    private Long id;

    @Column(name = "journalist", nullable = false)
    private String journalist;

    @Column(name = "comment", nullable = false)
    private String comment;

    @ManyToOne(optional = false)
    private Match match;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJournalist() {
        return journalist;
    }

    public void setJournalist(String journalist) {
        this.journalist = journalist;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}