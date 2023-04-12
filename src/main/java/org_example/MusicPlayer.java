package org_example;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

}
