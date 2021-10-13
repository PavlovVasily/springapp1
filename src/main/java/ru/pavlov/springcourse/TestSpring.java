package ru.pavlov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


        //ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        //ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);


        //System.out.println(classicalMusic.getSong());
        //System.out.println(classicalMusic2.getSong());


        int i = 0; //delete test for git

        Music music = context.getBean("rockMusic", Music.class);
        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        musicPlayer.playMusic();
        classicalMusicPlayer.playMusic();


/*        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        System.out.println(firstMusicPlayer == secondMusicPlayer);



        firstMusicPlayer.playMusic();
        System.out.println(firstMusicPlayer.getName());

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());*/




        context.close();

    }
}
