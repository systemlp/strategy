package com.lp.tratege.impl;

import com.lp.tratege.VehicleRunStrategy;

public class VehicleRunStrategyImpl implements VehicleRunStrategy {

    @Override
    public void running() {
        System.out.println("车辆正在行驶中……");
    }

}
