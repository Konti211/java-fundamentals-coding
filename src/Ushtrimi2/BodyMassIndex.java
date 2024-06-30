package Ushtrimi2;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write your weight in kg :");
        float weight = scan.nextFloat();

        System.out.print("Write your height in cm :");
        int heightcm = scan.nextInt();
        double heightm = ((double) heightcm)/100;
        double heightm2 = Math.pow(heightm,2);

        double BMI = weight/heightm2;
        System.out.println("BMI "+BMI);

        if (BMI<18.5){
            System.out.println("BMI not optimal");
        } else if  (BMI>24.9) {
            System.out.println("BMI not optimal");
        }
        else {
            System.out.println("BMI optimal");
        }
    }
}
