package Polymorphism.overriding;

public class execuator {

	public static void main(String[] args) {
    shape s1 = new shape();
    s1.calArea();
    
    s1=new Square(5.3f);
    s1.calArea();
    
    s1=new Rectangle(5.4d,5.4d);
    s1.calArea();
    }

}
