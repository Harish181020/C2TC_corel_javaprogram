package Polymorphism.overriding;

public class Square extends shape {
	
	public Square(float area)
	{
		super.Area=area;
	}
	public void callArea()
	{
		System.out.println("From square class:"+super.Area*super.Area);
	}

}
