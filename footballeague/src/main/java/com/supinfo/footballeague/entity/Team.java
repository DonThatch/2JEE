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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }
}
