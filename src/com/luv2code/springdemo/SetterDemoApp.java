package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterDemoApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean form spring container
        // CricketCoach theCoach = context.getBean("id",class name);
        CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);


        // call methods on the beans
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        // call our new methods to get literal values
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        // close the context
        context.close();

    }
}
