package com.supinfo.footballeague.servicesImpl;

import com.supinfo.footballeague.Repository.DayRepository;
import com.supinfo.footballeague.entity.Day;
import com.supinfo.footballeague.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DayServiceImpl implements DayService {
    @Autowired
    private DayRepository dayRepository;

    @Override
    public Day createDay(Day day) {
        return dayRepository.save(day);
    }

    @Override
    public Day getDayById(Long id) {
        return dayRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDay(Long id) {
        dayRepository.deleteById(id);
    }
}