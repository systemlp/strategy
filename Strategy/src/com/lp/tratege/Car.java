package com.lp.tratege;

import com.lp.tratege.impl.VehicleRunStrategyImpl;

public class Car extends Vehicle {
    
    public Car() {
        super();
        setRunStrategy(new VehicleRunStrategyImpl());
    }

    @Override
    protected void introduce() {
        System.out.println("这是一辆汽车，由XX汽车制造商于yyyy年制造……");
    }

}
