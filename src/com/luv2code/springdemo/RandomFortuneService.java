package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

    private String[] fortunes ={ "You will have a tough time",
            "You will meet a special person today",
            "You will enjoy in the mountains"};

    @Override
    public String getFortune(){
        int digit = (int) (Math.random() * 10);
        if (digit <= 2) {
            return fortunes[digit];
        } else {
            return getFortune();
        }
    }
}

