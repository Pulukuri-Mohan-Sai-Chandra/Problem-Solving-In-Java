package LearingPackage;

public class Triangle extends TwoDShape {

    private String style;

     Triangle(int height,int widht, String style){
        setHeight(height);
        setWidth(widht);
        this.style = style;
    }

    int area(){
         return getWidth() * getHeight();
    }

    void showStyle(){
         System.out.println("The Sytle of th object is "  + this.style);
    }

}
