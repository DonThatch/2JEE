package com.supinfo.footballeague.Repository;// EventRepository.java
import com.supinfo.footballeague.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}