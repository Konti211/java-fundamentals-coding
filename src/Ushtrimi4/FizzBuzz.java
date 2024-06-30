package Ushtrimi4;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a positive number : ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
        if (i%3==0 && i%7==0) {
            System.out.println("FizzBuzz");
        } else if (i%7==0) {
            System.out.println("Buzz");
        } else if (i%3==0) {
            System.out.println("Fizz");
        }else {
        System.out.println(i);}
        }
    }
}
