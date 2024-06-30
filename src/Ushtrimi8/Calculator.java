package Ushtrimi8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
       double vlera = Calculator.llogarit();
       System.out.println("Rezultati eshte = "+ vlera);
        }


    public static double llogarit(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Vendosni numrin e pare : ");
    float num1 = scan.nextFloat();

    System.out.print("Vendosni operatorin +,-,/,* :");
    char shenja = scan.next().charAt(0);

    System.out.print("Vendosni numrin tjeter : ");
    float num2 = scan.nextFloat();

    switch(shenja){
        case '+':
            return num1 + num2;
        case '-':
            return num1 - num2;
        case '/':
            if (num2==0) {
                System.out.println("Pjestimi me zero ska kuptim");
            }else{
                return num1/num2;
            }
        case '*':
            return num1*num2;

        default:
            System.out.println("Invalid operator");}

        return Integer.MIN_VALUE;
    }
}
