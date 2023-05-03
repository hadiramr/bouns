package javaapplication18;
public class triangle extends Shape{
 protected int side1;
  protected int side2;
  protected int side3;
   
 protected double s=(side1 +side2+side3)/2;
 protected double ss=s*(s-side1)*(s-side2)*(s-side3);
 protected double area ;
    public triangle(int numside) {
        super(numside);
    }
   public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
    @Override
    public double getArea() {
        
       area =Math.sqrt(ss);
        System.out.println("trianglearea is "+area);
        return area ;
        
    }
    
}
