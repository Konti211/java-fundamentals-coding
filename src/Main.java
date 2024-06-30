import Perseritje.Human;

public class Main {
    public static void main(String[] args){
        Human human = new Human();
        Human human2 = new Human("Ondi","E3456W",20);

        human.emri = "Konti";

        System.out.println(human.emri);
        System.out.println();
        System.out.print("Id eshte  " + human2.id);
        System.out.print(", Emri eshte " + human2.emri);
        System.out.print(", Mosha eshte  "+ human2.mosha);
    }
}