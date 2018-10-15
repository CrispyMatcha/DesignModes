package com.java.adaptermode.adapter;

import com.java.adaptermode.duck.Duck;
import com.java.adaptermode.turkey.WildTurkey;

/**
 * 通过适配器将火鸡模拟成鸭子（类适配器）
 */
public class TurkeyAdapter2 extends WildTurkey implements Duck {

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
    }

}
