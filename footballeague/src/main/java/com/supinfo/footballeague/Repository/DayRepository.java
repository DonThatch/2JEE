package com.supinfo.footballeague.Repository;// DayRepository.java
import com.supinfo.footballeague.entity.Day;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepository extends JpaRepository<Day, Long> {
}