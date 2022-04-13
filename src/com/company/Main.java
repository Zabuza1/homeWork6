package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Условие (аля мой метод)
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++ ){
            arr[i] = (int) Math.round((Math.random()*100_000)+ 100_000);
            sum = sum + arr[i];

        }
        System.out.println(sum + " ");
        //Задача 2.1
        int maxSum = arr[0];
        for (int xx: arr) {
            if (xx>maxSum)
                maxSum = xx;
        }
        System.out.println("The maximum amount spent was " + maxSum);
        //Задача 2.2
        int minSum = arr[0];
        for (int yy: arr){
            if (yy<minSum){
                minSum = yy;
            }
        }
        System.out.println("The minimum amount spent was " + minSum);
        // Задача 3
        float average =0;
        for (float sumS: arr){
            average += sumS;
        }
        System.out.println("the average amount spent is " + average/arr.length );
        // Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
            if (i>0) System.out.print(" ");
        }
        }
    }
