package com.supinfo.footballeague.Repository;// TeamRepository.java
import com.supinfo.footballeague.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}