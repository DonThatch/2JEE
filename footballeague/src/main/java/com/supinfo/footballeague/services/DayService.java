package com.supinfo.footballeague.services;

import com.supinfo.footballeague.entity.Day;

public interface DayService {
    Day createDay(Day day);
    Day getDayById(Long id);
    void deleteDay(Long id);
}