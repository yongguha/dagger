package com.commax.dagger2;

import javax.inject.Inject;

public class CoffeeMaker {
    @Inject
    Heater heater;
    @Inject
    Pump pump;

    @Inject
    CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public CoffeeMaker() {
    }

    public void brew(){
        heater.on();
        pump.pump();
        System.out.println("=======coffee==========");
        heater.off();
    }

    public Heater getHeater(){
        return heater;
    }

    public Pump getPump(){
        return pump;
    }


}
