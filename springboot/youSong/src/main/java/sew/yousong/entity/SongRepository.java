package sew.yousong.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long> {

    Song findById(long id);
    List<Song> findByTitle(String title);

}