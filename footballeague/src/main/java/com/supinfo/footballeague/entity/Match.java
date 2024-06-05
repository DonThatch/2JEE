package com.supinfo.footballeague.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "game")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "game_seq")
    @SequenceGenerator(name = "game_seq", allocationSize = 1, initialValue = 100)
    private Long id;

    @Column(name = "home_team_score")
    private Integer homeTeamScore;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "reason")
    private String reason;

    @OneToMany(mappedBy = "match")
    private List<Event> events = new ArrayList<>();

    @OneToMany(mappedBy = "match")
    private List<Comment> comments = new ArrayList<>();

    @Column(name = "away_team_score")
    private Integer awayTeamScore;

    @ManyToOne(optional = false)
    private Team homeTeam;

    @ManyToOne(optional = false)
    private Team awayTeam;

    @ManyToOne(optional = false)
    private Day day;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public Integer getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(Integer awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
