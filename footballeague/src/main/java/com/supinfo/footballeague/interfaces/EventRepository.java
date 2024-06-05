package com.supinfo.footballeague.interfaces;

import com.supinfo.footballeague.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}