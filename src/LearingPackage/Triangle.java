package LearingPackage;

public class Triangle extends TwoDShape {

    private String style;

    Triangle(){
        System.out.println("Default Constructure of Triangle is Called");
    }
     Triangle(int height,int widht, String style){
        super(height,widht);
        this.style = style;
    }

    int area(){
         return getWidth() * getHeight();
    }

    void showStyle(){
         System.out.println("The Sytle of th object is "  + this.style);
    }

}
