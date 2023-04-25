package org.example.music;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList;

    Random random = new Random();

    int upperbound = 3;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        return "Playing: " + musicList.get(random.nextInt(upperbound)).getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
