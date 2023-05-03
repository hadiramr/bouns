
package javaapplication18;

public class JavaApplication18 {

  
    public static void main(String[] args) {
        triangle t1=new triangle(3);
        t1.setSide1(2);
        t1.setSide2(3); 
        t1.setSide3(4);
        t1.getArea();
        rectangle r1=new rectangle (2);
        r1.setLength(3);
        r1.setWidth(4);
        r1.getArea();
    }
    
}
