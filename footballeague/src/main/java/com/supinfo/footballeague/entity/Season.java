package com.supinfo.footballeague.entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "season")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Season {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.SEQUENCE, generator = "season_seq")
    @SequenceGenerator(name = "season_seq", allocationSize = 1, initialValue = 100)
    private Long id;

    @Column(name = "year", updatable = false, nullable = false)
    private Integer year;

    @Column(name ="description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "season")
    private List<Day> days = new ArrayList<>();

    @ManyToMany
    private List<Team> teams = new ArrayList<>();

}
