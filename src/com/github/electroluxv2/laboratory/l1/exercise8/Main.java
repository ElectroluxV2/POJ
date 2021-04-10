package com.github.electroluxv2.laboratory.l1.exercise8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int n1 = 0, n2 = 1, n3 = 0;
        System.out.printf("%d %d", n1, n2);

        while (n3 < n){
            n3 = n1 + n2;
            if (n3 >= n) break;
            System.out.printf(" %d", n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
