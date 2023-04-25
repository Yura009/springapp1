package org.example.music;

import org.example.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
        context.close();
    }
}
