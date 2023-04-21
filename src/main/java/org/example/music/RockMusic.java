package org.example.music;

import org.springframework.stereotype.Component;

@Component("musicRockBean")
public class RockMusic implements Music{
    public String getSong() {
        return "Wind";
    }
}
