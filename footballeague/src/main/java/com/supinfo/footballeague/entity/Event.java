package com.supinfo.footballeague.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "event")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_seq")
    @SequenceGenerator(name = "event_seq", allocationSize = 1, initialValue = 100)
    private Long id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "player", nullable = false)
    private String player;

    @Column(name = "comment")
    private String comment;

    @ManyToOne(optional = false)
    private Match match;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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