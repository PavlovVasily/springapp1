package ru.pavlov.springcourse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("Wind cries Mary");
        musicList.add("Wind cries Kate");
        musicList.add("Wind cries Vasya");
    }

    @Override
    public ArrayList<String> getSong() {

        return (ArrayList<String>) musicList;
    }
}
