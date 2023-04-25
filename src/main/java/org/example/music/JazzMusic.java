package org.example.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JazzMusic implements Music {
    List<String> musicList = new ArrayList<String>();

    Random random = new Random();

    int upperbound = 3;

    public JazzMusic() {
        musicList.add("Jazz1");
        musicList.add("Jazz2");
        musicList.add("Jazz3");
    }

    public String getSong() {
        return musicList.get(random.nextInt(upperbound));
    }
}
