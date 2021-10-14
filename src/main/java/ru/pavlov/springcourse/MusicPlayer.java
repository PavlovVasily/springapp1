package ru.pavlov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;

    }

    public String playMusic(ClassificationMusic classificationMusic){

        if(classificationMusic == ClassificationMusic.CLASSICAL)
            return "Playing: " + music1.getSong().get(getRandomNumber(0,3));

        else if(classificationMusic == ClassificationMusic.ROCK)
            return "Playing: " + music2.getSong().get(getRandomNumber(0,3));

        else
            return "Playing: nothing";
    }

    private int getRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min)  + min;
    }


}
