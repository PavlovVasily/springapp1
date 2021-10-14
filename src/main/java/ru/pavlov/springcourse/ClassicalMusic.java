package ru.pavlov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("Hungarian Rhapsody");
        musicList.add("Russian Rhapsody");
        musicList.add("Moldovan Rhapsody");
    }

    @Override
    public ArrayList<String> getSong() { return (ArrayList<String>) musicList; }


}
