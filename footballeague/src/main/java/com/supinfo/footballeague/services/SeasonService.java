package com.supinfo.footballeague.services;

import com.supinfo.footballeague.entity.Season;

public interface SeasonService {
    Season createSeason(Season season);
    Season getSeasonById(Long id);
    void deleteSeason(Long id);
}