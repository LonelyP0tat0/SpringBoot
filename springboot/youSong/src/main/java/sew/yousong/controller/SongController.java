package sew.yousong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import sew.yousong.entity.Song;
import sew.yousong.entity.SongRepository;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")

public class SongController {

    @Autowired
    private SongRepository songRepo;

    @GetMapping("/songs")
    public List<Song> getAllSongs() {
        return songRepo.findAll();
    }

}
