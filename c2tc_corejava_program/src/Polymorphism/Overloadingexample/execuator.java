package Polymorphism.Overloadingexample;

public class execuator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("1.Addition:"+Overloadingexample.addition("raj","kumar"));
   System.out.println("2.Addition:"+Overloadingexample.addition(10000,150));
   System.out.println("3.Addition:"+Overloadingexample.addition(10.0f,20.0f));
   System.out.println("4.Addition:"+Overloadingexample.addition(21,45.0f));
person p1 = new person();
System.out.println(p1);

p1=new person(101,"deva");
System.out.println(p1);

p1=new person(102,"anbu","arani");
System.out.println(p1);
}}