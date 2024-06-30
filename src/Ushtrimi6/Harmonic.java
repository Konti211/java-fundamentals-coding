package Ushtrimi6;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number : ");
        int n = scanner.nextInt();

        double sum = 0;

        for (int i=1; i<n; i++){
            System.out.println("Shuma :" +sum+"iteracioni"+i);
            sum = sum +(double) 1/i;
        }
        System.out.println("Sum of the harmonic series is : " + sum);
    }
}
