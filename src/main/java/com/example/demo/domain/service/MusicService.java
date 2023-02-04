package com.example.demo.domain.service;

import com.example.demo.domain.model.Music;
import com.example.demo.domain.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * MusicService.
 */
@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    @Transactional
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Transactional(readOnly = true)
    public Music findById(Integer id) {
        return musicRepository.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public Iterable<Music> findAll() {
        return musicRepository.findAll();
    }
    
}
