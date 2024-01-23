package ru.rusalitc.java.basic.homework5;

import java.sql.SQLOutput;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void toEat(Plate plate) {
        if (plate.getCurentFood() < appetite) {
            System.out.println(name + " не поел, для него в тарелке мало еды");
            return;
        }
        plate.decreaseFood(appetite);
        fullness = true;

    }

    public void fullnessInfo() {
        if (fullness) {
            System.out.println(name + " cыт");
        } else {
            System.out.println(name + " голоден");
        }
    }
}


