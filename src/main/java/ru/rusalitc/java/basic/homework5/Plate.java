package ru.rusalitc.java.basic.homework5;

public class Plate {
    private int maxFood;
    private int curentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.curentFood = maxFood;
    }

    public int getCurentFood() {
        return curentFood;
    }

    public void putFood() {
        curentFood = maxFood;
        System.out.println("Тарелку наполнили едой");
    }

    public boolean decreaseFood(int appetite) {// Не понял из задания как можно использовать метод  с boolean , тарелка не может уйти в минус, т.к. коты не будут есть если еды будет меньше их аппетита
        curentFood -= appetite;
        if (curentFood >= 0) return true;
        else return false;



    }
}
