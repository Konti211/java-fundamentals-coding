package Perseritje;

public class Human {
    public  String emri;
    public String id;
    public int mosha = 20;


    public Human(){}

    public Human(String emri,String id,int mosha){
        this.emri = emri;
        this.id = id;
        this.mosha = mosha;
    }

    public  void walk(){
        System.out.println(emri + "eshte duke ecur.");
    }

    public  void sleep(){
        System.out.println(emri + "eshte duke fjetur.");
    }
}
