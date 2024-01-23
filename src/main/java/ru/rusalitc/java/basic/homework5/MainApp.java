package ru.rusalitc.java.basic.homework5;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Барон", 20),
                new Cat("Толстяк", 30),
                new Cat("Мурзик", 15),
                new Cat("Малыш", 5)
        };

        boolean fullnessCat = false;
        while (!fullnessCat) {
            int counterFalse = 0;
            for (int i = 0; i < cats.length; i++) {
                if (!cats[i].isFullness()) cats[i].toEat(plate);
            }
            for (int i = 0; i < cats.length; i++) {
                cats[i].fullnessInfo();
            }
            for (int i = 0; i < cats.length; i++) {
                if (!cats[i].isFullness()) {
                    fullnessCat = false;
                    counterFalse++;
                }
            }
            if (counterFalse == 0) {
                System.out.println("Все коты накормлены");
                fullnessCat = true;
            }
            else {
                plate.putFood();
            }

        }
    }
}
