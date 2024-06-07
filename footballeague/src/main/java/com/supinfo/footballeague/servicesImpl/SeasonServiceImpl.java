package com.supinfo.footballeague.servicesImpl;

import com.supinfo.footballeague.Repository.SeasonRepository;
import com.supinfo.footballeague.entity.Season;
import com.supinfo.footballeague.services.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonServiceImpl implements SeasonService {
    @Autowired
    private SeasonRepository seasonRepository;

    @Override
    public Season createSeason(Season season) {
        return seasonRepository.save(season);
    }

    @Override
    public Season getSeasonById(Long id) {
        return seasonRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSeason(Long id) {
        seasonRepository.deleteById(id);
    }
}