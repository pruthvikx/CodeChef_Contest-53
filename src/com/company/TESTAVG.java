package com.company;

import java.util.Scanner;

public class TESTAVG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i = 0; i < testCase; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            double avg1 = (A + B)/2;
            double avg2 = (A + C)/2;
            double avg3 = (B+C)/2;

            if ((avg1 < 35) || (avg2 < 35) || (avg3 < 35)){
                System.out.println("Fail");
            }else {
                System.out.println("Pass");
            }

        }
    }
}
