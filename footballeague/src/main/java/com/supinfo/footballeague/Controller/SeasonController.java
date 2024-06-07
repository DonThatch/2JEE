package com.supinfo.footballeague.controller;

import com.supinfo.footballeague.entity.Season;
import com.supinfo.footballeague.services.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seasons")
public class SeasonController {

    @Autowired
    private SeasonService seasonService;

    @PostMapping
    public Season createSeason(@RequestBody Season season) {
        return seasonService.createSeason(season);
    }

    @GetMapping("/{id}")
    public Season getSeasonById(@PathVariable Long id) {
        return seasonService.getSeasonById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteSeason(@PathVariable Long id) {
        seasonService.deleteSeason(id);
    }
}