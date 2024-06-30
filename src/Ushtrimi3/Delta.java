package Ushtrimi3;

import java.util.Scanner;

public class Delta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a :");
        int a = scanner.nextInt();

        System.out.print("Write b :");
        int b = scanner.nextInt();

        System.out.print("Write c :");
        int c = scanner.nextInt();

        double D = Math.pow(b,2)-4*a*c;
        System.out.println("Dallori eshte = "+D);


        if (D>0){
            double x1 = -b-Math.sqrt(D)/2*a;
            double x2 = -b+Math.sqrt(D)/2*a;
            System.out.println("Ka dy rrenje");
            System.out.println("X1 eshte = "+x1);
            System.out.println("X2 eshte = "+x2);
        } else if(D==0) {
            double x1 = -b-Math.sqrt(D)/2*a;
            System.out.println("Dallori ka nje rrenje");

        }else {
            System.out.println("Dallori eshte negative");
        }
    }
}
