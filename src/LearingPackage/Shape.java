package LearingPackage;

public class Shape {

    public static void main(String args[]){
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        t1.height = 12;
        t2.height = 11;
        t1.width = 122;
        t2.width = 111;
        t1.style = "Filled";
        t2.style = "Outline";
        t1.showDim();
        t2.showDim();

    }


}
