package org.example.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    private RockMusic rockMusic;
    /*private String name;
    private int volume;

    public void doMyInit(){
        System.out.println("init");
    }

    public void doMyDestroy(){
        System.out.println("destroy");
    }*/

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public String playMusic() {
        /*//for (Music music : musicList) {
            System.out.println("Playing: " + classicalMusic.getSong());
            System.out.println("Playing: " + rockMusic.getSong());
        //}*/
        return classicalMusic.getSong() + rockMusic.getSong();
    }

    /*public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }*/

}
