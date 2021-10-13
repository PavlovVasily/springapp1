package ru.pavlov.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();

    }

    public void doMyInitMethod(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroyMethod(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() { return "Hungarian Rhapsody"; }


}
