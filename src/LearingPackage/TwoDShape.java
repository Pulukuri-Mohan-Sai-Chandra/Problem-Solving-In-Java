package LearingPackage;

public class TwoDShape {

    private int height;
    private int width;

     void setHeight(int data){
        this.height = data;
    }
     void setWidth(int data){
        this.width = data;
    }
    int getHeight(){
        return this.height;
    }
    int getWidth(){
        return this.width;
    }
    void showDim(){
        System.out.println("The Shape has " + this.height + " heigth" + " and "+this.width + " Width");
    }
}
