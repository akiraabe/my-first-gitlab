package com.example.demo.domain.repository;

import com.example.demo.domain.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * MusicRepository.
 */
@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {}
