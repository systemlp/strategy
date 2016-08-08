package com.lp.tratege;

/**
 * 
 * 〈车的抽象基类〉<br>
 * 〈功能详细描述〉
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public abstract class Vehicle {

    private VehicleRunStrategy runStrategy;

    public void setRunStrategy(VehicleRunStrategy runStrategy) {
        this.runStrategy = runStrategy;
    }

    protected abstract void introduce();

    protected void running() {
        runStrategy.running();
    }

}
