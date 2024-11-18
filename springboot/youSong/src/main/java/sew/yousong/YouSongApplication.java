package sew.yousong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import sew.yousong.entity.Song;
import sew.yousong.entity.SongRepository;

@SpringBootApplication
public class YouSongApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(YouSongApplication.class, args);
	}

	@Autowired
	private SongRepository songRepository;

	@Override
	public void run(String... args) throws Exception {
		Song song1 = new Song("void", "Six Tin Jonesy", "03:44", 2012, "punk ska");
		Song song2 = new Song("RuLe", "Ado", "03:17", 2024, "J-Pop");
		Song song3 = new Song("Kick Back", "Kenshi Yonezu", "03:13", 2024, "Japanese Rock");

		songRepository.save(song1);
		songRepository.save(song2);
		songRepository.save(song3);
	}
}

