package com.HW3;

import java.util.Arrays;

public class HW3 {

    public static void main(String[] args) {
        double[] day = {32.1, -21.1, 43.2, -1.2, 1.3, -1.3, 1.4, -29.4, 1.5,
                -1.5, 99.6, -1.6, -92.7, -12.7, 8.8};
        double result = 0;
        int i = 0;
        boolean s1 = false;
        for (double a : day) {
            if (a > 0 && s1) {
                result += a;
                i++;
                System.out.println(a);
            } else {
                s1 = true;
                continue;
            }
        }
        System.out.println(result / i);
        System.out.println("---------------------------");
        word (day);
    }
    public static void word (double[]a){
        int size = a.length;
        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - i -1; j++)
            {
                if (a[j]> a[j+1]){
                    double c = a[j];
                    a[j]=a[j + 1];
                    a[j+1]=c;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}