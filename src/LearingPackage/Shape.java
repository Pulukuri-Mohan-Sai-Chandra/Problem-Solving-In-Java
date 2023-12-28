package LearingPackage;

public class Shape {

    public static void main(String args[]){

        Triangle sp1 = new Triangle(10,10,"Filled");
        Triangle sp2 = new Triangle(11,12,"Outline");

        System.out.println("The Area of the Triangle sp1 is " + sp1.area());
        System.out.println("The Area of the Triangle sp2 is " + sp2.area());
        sp1.showDim();
        sp2.showDim();


    }


}
