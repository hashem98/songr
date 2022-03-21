package com.example.songr.Repositories;

import com.example.songr.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}
