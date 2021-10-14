package ru.pavlov.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Music music = context.getBean("rockMusic", Music.class);
//        Music music2 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//
//        musicPlayer.playMusic();
//        classicalMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

//        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

//        System.out.println(classicalMusic1 == classicalMusic2);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);


        context.close();

    }
}
