package com.supinfo.footballeague.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "day")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "day_seq")
    @SequenceGenerator(name = "day_seq", allocationSize = 1, initialValue = 100)
    private Long id;

    @Column(name = "number", updatable = false, nullable = false)
    private Integer number;
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @OneToMany(mappedBy = "day")
    private List<Match> matches = new ArrayList<>();

    @ManyToOne(optional = false)
    private Season season;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
