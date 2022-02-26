package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    public TrackCoach() {
        // it is used for MyApp.java class.
    }

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public TrackCoach(FortuneService theFortuneService) {

        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Running 5km daily!!";
    }

    @Override
    public String getDailyFortune() {

        return "Just do it: " + fortuneService.getFortune();
    }


    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Track Coach: inside method destroy");
    }

}
