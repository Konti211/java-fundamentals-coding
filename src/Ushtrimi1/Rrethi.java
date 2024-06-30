package Ushtrimi1;

import java.util.Scanner;

public class Rrethi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Jep diametrin : ");
        float diametri = scan.nextFloat();

        float rrezja = diametri/2f;

        double perimetri = 2*Math.PI*rrezja;

        float perimetri2 = (float) (2*Math.PI*rrezja);

        System.out.println("Perimetri eshte : "+perimetri);
        System.out.println("Perimetri float eshte : "+perimetri2);
    }
}
