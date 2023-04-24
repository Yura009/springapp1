package org.example.music;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("musicClassicBean")
public class ClassicalMusic implements Music{

    List<String> musicList = new ArrayList<String>();

    Random random = new Random();

    int upperbound = 3;

    public ClassicalMusic() {
        musicList.add("Classic1");
        musicList.add("Classic2");
        musicList.add("Classic3");
    }

    public String getSong() {
        return musicList.get(random.nextInt(upperbound));
    }
}
