package Ushtrimi5;

import java.util.Scanner;

public class PrimeNUmbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a positive number " );
        int a = scanner.nextInt();

        for (int i=1;i<a;i++){
         if (isPrime(i)){
             System.out.println(i);
         }
        }
    }
    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }return true;

    }
}
