package LearnInheritance;

public class Parent {

    private String n1;
    private String n2;

    Parent(){
        System.out.println("Default Constructor of Parent is Called \n ");
    }
    Parent(String n1,String n2){
    this.n1 = "N2 Value in Parent";
    this.n2 = "N1 Value in Parent";
    }
    void show(){
        System.out.println(this.n1);
        System.out.println(this.n2);
    }
}
