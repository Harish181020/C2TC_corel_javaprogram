package Polymorphism.overriding;

public class Rectangle extends shape{
	private double l, b ;
	public Rectangle(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	@Override
	public void calArea()
	{
	System.out.println("From Rectangle class:"+(l*b));
	}
	

}
