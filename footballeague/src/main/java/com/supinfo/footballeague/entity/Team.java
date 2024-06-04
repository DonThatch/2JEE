package com.supinfo.footballeague.entity;

import lombok.*;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "team")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Team {
@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_seq")
    @SequenceGenerator(name = "team_seq", allocationSize = 1, initialValue = 100)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "stadium", nullable = false)
    private String stadium;

    @ManyToMany(mappedBy = "teams")
    private List<Season> seasons = new ArrayList<>();
}
