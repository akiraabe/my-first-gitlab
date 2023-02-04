package com.example.demo.api;

import com.example.demo.domain.model.Music;
import com.example.demo.domain.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MusicController.
 */
@RequestMapping("/")
@RestController
public class MusicController {

    @Autowired
    private MusicService musicService;
  
    /**
     * Find all music.
     *
     * @return music list.
     */
    @GetMapping("/music")
    public Iterable<Music> findAll() {
        return musicService.findAll();
    }

    /**
     * Find music by id.
     *
     * @param id
     * @return music instance.
     */
    @GetMapping("/music/{id}")
    public Music findById(@PathVariable Integer id) {
        return musicService.findById(id);
    }

    /**
     * Save music.
     *
     * @param music
     */
    @PostMapping("/music")
    public void save(@RequestBody Music music) {
        musicService.save(music);
    }

}
