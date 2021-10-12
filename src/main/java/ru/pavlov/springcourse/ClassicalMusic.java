package ru.pavlov.springcourse;

public class ClassicalMusic implements Music {

    public void doMyInitMethod(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroyMethod(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() { return "Hungarian Rhapsody"; }


}
