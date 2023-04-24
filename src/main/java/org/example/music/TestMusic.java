package org.example.music;

import org.example.computer.Computer;
import org.example.enums.MusicGenre;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(firstMusicPlayer == secondMusicPlayer);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
       /* secondMusicPlayer.setVolume(66);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        firstMusicPlayer.playMusic();
        System.out.println("Name: " + firstMusicPlayer.getName() + " Volume: " + firstMusicPlayer.getVolume());*/
        System.out.println(firstMusicPlayer.playMusic(MusicGenre.ROCK));
        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer.toString());
        ClassicalMusic classicalMusic = context.getBean("musicClassicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("musicClassicBean", ClassicalMusic.class);
        System.out.println(classicalMusic == classicalMusic1);
        context.close();
    }
}
