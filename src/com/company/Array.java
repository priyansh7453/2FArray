package com.company;

import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
	// write your code here
        // input The Array
        // type [] nameOfArray = new type[int size]
        System.out.println("initialize the array ");
        int arr1[] = new int[]{1,2,3,4,5};
        String srr[] = new String[]{"sd","fe","ef","fsd"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(srr));

      // For random data
        int arr [] = new int[10];
        Random random = new Random();
        int upperLimit = 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        // To remove the commas (" , ")

         System.out.print("indexs:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i);
            if(i != arr.length - 1){
                System.out.print(",");
            }
        }
        //to change line
        System.out.println();
        System.out.print("values:\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();


//        System.out.print("The indexes are :--  ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i+",");
//        }
//        System.out.println();
//        System.out.print("its values are :--  ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//        }

        // Print odd number

        System.out.println();
        System.out.println("the odd number from random number ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 !=0)
                System.out.print(arr[i]+ ",");
        }

        // even number from the odd positions

        System.out.println();
        System.out.println("even number from the odd positions ");
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 != 0){
                if(arr[i]%2==0){
                    System.out.print(arr[i] +",");
                }
            }
        }
    }
}