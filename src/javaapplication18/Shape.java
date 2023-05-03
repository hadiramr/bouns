
package javaapplication18;
public abstract class Shape {
  protected int numside;
 

 
public Shape (int numside){
    this.numside=numside;
}  

    public int getNumside() {
        return numside;
    }

    public void setNumside(int numside) {
        this.numside = numside;
    }
public abstract double getArea();
}