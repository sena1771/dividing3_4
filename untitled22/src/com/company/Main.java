package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum = 0;
        double average;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.print("The number: ");
        int number= input.nextInt();

        for(int i=0 ; i <= number; i++ ) {
            if (i % 12 != 0) {
                sum += i;
                count++;
                continue;
            }


        }
average=sum/count;
    System.out.println("total : "+average);



         }
    }

