package com.commax.dagger2;

import javax.inject.Singleton;

import dagger.Component;

//@Singleton
@Component(modules = CoffeeMakerModule.class)
public interface CoffeeComponent {
    //provision Method
    CoffeeMaker coffeeMaker();
    /**
     *  @Inject
     *     CoffeeMaker(Heater heater, Pump pump) {
     *         this.heater = heater;
     *         this.pump = pump;
     *     }
     *  위와 같이 생성자에 @Inject를 붙여야 한다.
     *  DaggerCoffeeComponent.create().coffeeMaker().brew();
     */

    //member-injection Method
    void inject(CoffeeMaker coffeemaker);
    /*
    *   @Inject
        Heater heater;
        @Inject
        Pump pump;
    *
    *   아래와 같이 사용하려면, 위와 같이 멤버변수에 @Inject를 붙여야 한다.
    *   CoffeeMaker coffeemaker = new CoffeeMaker();
        DaggerCoffeeComponent.create().inject(coffeemaker);
        coffeemaker.brew();
     */

}
