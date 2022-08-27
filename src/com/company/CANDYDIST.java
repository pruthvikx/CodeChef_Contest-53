package com.company;

import java.util.Scanner;

public class CANDYDIST {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i = 0; i<testCase;i++){
            double N = scan.nextInt();
            double M = scan.nextInt();
            double div = N / M;
            if (div % 2 == 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
