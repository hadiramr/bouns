package javaapplication18;
public class rectangle extends Shape{
 protected int length;
  protected int width;
 protected double area ;
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public rectangle(int numside) {
        super(numside);
    }

    public double getArea() {
        area =length*width;
         System.out.println("rectanglearea is "+area);
        return area;
   }
    
}
