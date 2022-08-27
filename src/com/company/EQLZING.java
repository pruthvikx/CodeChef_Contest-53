package com.company;

import java.util.Scanner;

public class EQLZING {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i = 0;i < testCase;i++){
            int A = scan.nextInt();
            int B = scan.nextInt();

            if (A == B){
                System.out.println("Yes");
            }
        }
    }
}
