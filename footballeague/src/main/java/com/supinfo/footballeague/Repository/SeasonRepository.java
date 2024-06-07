package com.supinfo.footballeague.Repository;

import com.supinfo.footballeague.entity.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season, Long> {
}