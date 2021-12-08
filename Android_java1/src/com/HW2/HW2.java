package com.HW2;

import java.util.Random;

public class HW2 {

    public static void main(String[] args) {
        System.out.println(iIi(generateRandomAge(), 25));
        System.out.println(iIi(generateRandomAge(), 23));
        System.out.println(iIi(generateRandomAge(), 16));
        System.out.println(iIi(generateRandomAge(), 40));
        System.out.println(iIi(generateRandomAge(), 37));
    }

    public static String iIi(int age, int temp) {

        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять 1";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять 2";
        } else if (age > 45 && temp > -10 && temp < 25) {
            return "Можно идти гулять 3";
        } else {
            return "Оставайтесь дома ";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt() * 60;
    }

}