package com.geektech;

public class Main {

    public static void main(String[] args) {
        System.out.println(ageAndTemperature(generateRandomAge(), -30));
        System.out.println(ageAndTemperature(generateRandomAge(), 0));
        System.out.println(ageAndTemperature(generateRandomAge(), 15));
        System.out.println(ageAndTemperature(generateRandomAge(), 20));
        System.out.println(ageAndTemperature(generateRandomAge(), 25));
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

    public static int generateRandomAge () {
        int a = 0;
        int b = 100;
        int random = a + (int) (Math.random() * b);
        return random;
    }
}
