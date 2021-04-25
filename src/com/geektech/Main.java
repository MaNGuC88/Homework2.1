package com.geektech;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageAndTemperature(15, -30));
        System.out.println(ageAndTemperature(33, 0));
        System.out.println(ageAndTemperature(28, 15));
        System.out.println(ageAndTemperature(5, 20));
        System.out.println(ageAndTemperature(3, 25));
    }

    public static String ageAndTemperature(int ageOfPerson, int outsideTemperature) {
        if (ageOfPerson > 20 && ageOfPerson < 45 && outsideTemperature > -20 && outsideTemperature < 30)
            return "Можно идти гулять";
        else if (ageOfPerson < 20 && outsideTemperature > 0 && outsideTemperature < 28)
            return "Моэно идти гулять";
        else if (ageOfPerson > 45 && outsideTemperature > -10 && outsideTemperature < 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }

}
