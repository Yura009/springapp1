package org.example.music;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing me destroying");
    }
}
