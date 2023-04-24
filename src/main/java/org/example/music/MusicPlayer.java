package org.example.music;

import org.example.enums.MusicGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("musicRockBean") Music music1,
                       @Qualifier("musicClassicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicGenre musicGenre) {
        if (musicGenre.equals(MusicGenre.ROCK)){
            return "Playing: " + music1.getSong();
        }
        if (musicGenre.equals(MusicGenre.CLASSICAL)) {
            return "Playing: " + music2.getSong();
        }
        return "Nothing!";
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
