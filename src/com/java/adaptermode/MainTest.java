package com.java.adaptermode;

import com.java.adaptermode.adapter.TurkeyAdapter;
import com.java.adaptermode.adapter.TurkeyAdapter2;
import com.java.adaptermode.duck.Duck;
import com.java.adaptermode.duck.GreenHeadDuck;
import com.java.adaptermode.turkey.WildTurkey;

public class MainTest {
    public static void main(String[] args) {
        GreenHeadDuck duck = new GreenHeadDuck();

        WildTurkey turkey = new WildTurkey();

        Duck duck2turkeyAdapter = new TurkeyAdapter2();

        turkey.gobble();
        turkey.fly();

        duck.quack();
        duck.fly();

        duck2turkeyAdapter.quack();
        duck2turkeyAdapter.fly();
    }
}
