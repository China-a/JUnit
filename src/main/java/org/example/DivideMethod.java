package org.example;

import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());

        divide(firstNum, secondNum);
        scanner.close();
    }

    public static Integer divide(int num1, int num2) {
        System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / (double)num2) );
        return num1 / num2;
    }
}
