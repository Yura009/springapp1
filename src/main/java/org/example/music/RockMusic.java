package org.example.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("musicRockBean")
public class RockMusic implements Music{
    List<String> musicList = new ArrayList<String>();

    Random random = new Random();

    int upperbound = 3;

    public RockMusic() {
        musicList.add("Rock1");
        musicList.add("Rock2");
        musicList.add("Rock3");
    }

    public String getSong() {
        return musicList.get(random.nextInt(upperbound));
    }
}
