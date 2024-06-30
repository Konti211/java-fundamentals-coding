package Ushtrimi7;

import java.util.Scanner;

public class Fibonacci {
        public static int Fibo(int index){

            if(index==0){
                return 0;
            }if (index==1) {
                return 1;
            }

            int num1 = 0;
            int num2 = 1;

            for (int i=0;i<index - 1;i++){
                int num3 = num1+num2;
                num1 = num2;
                num2 = num3;

                }

            return num2;
        }
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put a number :");
            int num = scanner.nextInt();

            if (num >= 0 ){
                    System.out.println(Fibonacci.Fibo(num) + " ");
                }else {
                System.out.println("Invalid number");
            }
        }
}

