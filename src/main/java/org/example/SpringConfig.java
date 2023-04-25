package org.example;

import org.example.computer.Computer;
import org.example.music.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public JazzMusic musicJazzBean(){
        return new JazzMusic();
    }
    @Bean
    public ClassicalMusic musicClassicBean() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic musicRockBean() {
        return new RockMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(musicClassicBean(),musicRockBean(),musicJazzBean());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
