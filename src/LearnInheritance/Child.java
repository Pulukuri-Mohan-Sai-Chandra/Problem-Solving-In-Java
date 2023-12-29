package LearnInheritance;

public class Child extends Parent {
    private String n3;
    private String n4;

    Child(String n3, String n4){
        this.n3 = "N3 Value in Child Class";
        this.n4 = "N4 Value in Child Class";
    }


    @Override
    void show(){
        System.out.println(this.n3);
        System.out.println(this.n4);
    }

}
