package com.HW1;
import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        String GG = "Java";
        final int NUM = 314;
        String word = "Android";
        GG = NUM + word;
        System.out.println(GG + NUM + word);

        if (NUM < 0)
            System.out.println("Вы сохранилиотрицательное число");
        else if (NUM > 0)
            System.out.println("Вы сохранили положительное число");
        else
            System.out.println("“Вы сохранили нуль");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String RR = in.nextLine();
        System.out.println("Привет: " + RR);
    }
}
