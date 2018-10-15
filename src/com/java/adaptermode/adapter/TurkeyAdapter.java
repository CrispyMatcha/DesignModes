package com.java.adaptermode.adapter;

import com.java.adaptermode.duck.Duck;
import com.java.adaptermode.turkey.Turkey;

/**
 * 通过适配器将火鸡模拟成鸭子（对象适配器）
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 6;i++){
            turkey.fly();
        }
    }
}
