package com.example.songr.Repositories;

import com.example.songr.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
