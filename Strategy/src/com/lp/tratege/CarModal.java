package com.lp.tratege;

import com.lp.tratege.impl.VehicleNoRunStrategyImpl;

public class CarModal extends Vehicle {
    
    public CarModal() {
        super();
        setRunStrategy(new VehicleNoRunStrategyImpl());
    }

    @Override
    protected void introduce() {
        System.out.println("这是xx汽车的模型，非常的精美……");
    }

}
