package Kutia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Kuti kuti1 = new Kuti(21,25,36);
        Kuti kuti2 = new Kuti(30,22,15);

        int vellimi1 = (int) kuti1.vellimi();
        int vellimi2 = (int) kuti2.vellimi();

        System.out.println("Vellimi i kutise se pare eshte : "+vellimi1);
        System.out.println("Vellimi i kutise se dyte eshte : "+vellimi2);

    }
}
