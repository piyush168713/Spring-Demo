package com.luv2code.springdemo;

public class CricketCoach implements Coach{


    // we need a helper so we need to make use of our dependency here
    private FortuneService fortuneService;

    // add new fields for emailaddress and team
    private String emailAddress;
    private String team;

    
    // create a no-arg constructor coz spring's gonna actually call this constructor when they make a reference to our bean.
    public CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public String getEmailAddress(){                  // get mtd
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {         // set mtd

        this.emailAddress = emailAddress;
    }

    public String getTeam(){                 // get mtd
        System.out.println("CricketCoach: inside setter method - setTeam");
        return team;
    }

    public void setTeam(String team) {                          // set mtd

        this.team = team;
    }


    // setter method for injections
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method");
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout(){

        return "Takes 5 wickets daily.";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}
