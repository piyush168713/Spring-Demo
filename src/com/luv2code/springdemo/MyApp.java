package com.luv2code.springdemo;

public class MyApp {
    public static void main(String[] args) {

        // Create the Object
        Coach theCoach = new TrackCoach();
        // Coach theCoach = new BaseballCoach();

        // Use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
