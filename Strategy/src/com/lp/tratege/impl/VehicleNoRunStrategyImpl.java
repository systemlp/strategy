package com.lp.tratege.impl;

import com.lp.tratege.VehicleRunStrategy;

public class VehicleNoRunStrategyImpl implements VehicleRunStrategy {

    @Override
    public void running() {
        System.out.println("Sorry!无法行驶……");
    }

}
