package org.example.music;

import org.example.enums.EnumMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("musicRockBean") Music music1,
                       @Qualifier("musicClassicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(EnumMusic enumMusic) {
        if (enumMusic.equals(EnumMusic.ROCK)){
            return "Playing: " + music1.getSong();
        }
        if (enumMusic.equals(EnumMusic.CLASSICAL)) {
            return "Playing: " + music2.getSong();
        }
        return "Nothing!";
    }
}
