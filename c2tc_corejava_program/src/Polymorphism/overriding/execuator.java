package Polymorphism.overriding;

public class execuator {

	public static void main(String[] args) {
    shape s1 = new shape();
    s1.calArea();
    
    s1=new Square(4.3f);
    s1.calArea();
    
    s1=new Rectangle(4.4d,4.4d);
    s1.calArea();
    }

}
