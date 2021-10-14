package ru.pavlov.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;


@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(), popMusic(), rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    /*@Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicalMusic(), rockMusic(), popMusic());
    }*/

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }


/*
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }*/
}
