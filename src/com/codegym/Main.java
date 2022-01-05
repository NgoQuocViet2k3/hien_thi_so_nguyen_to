package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kì");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + "không phải là số nguyên tố");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number);) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " là số nguyên tố");
            else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }
    }
}
