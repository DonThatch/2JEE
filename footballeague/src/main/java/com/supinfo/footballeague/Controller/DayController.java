package com.supinfo.footballeague.controller;

import com.supinfo.footballeague.entity.Day;
import com.supinfo.footballeague.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/days")
public class DayController {

    @Autowired
    private DayService dayService;

    @PostMapping
    public Day createDay(@RequestBody Day day) {
        return dayService.createDay(day);
    }

    @GetMapping("/{id}")
    public Day getDayById(@PathVariable Long id) {
        return dayService.getDayById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDay(@PathVariable Long id) {
        dayService.deleteDay(id);
    }
}