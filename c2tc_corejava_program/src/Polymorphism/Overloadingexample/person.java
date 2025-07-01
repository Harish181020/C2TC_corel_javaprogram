package Polymorphism.Overloadingexample;

public class person {
private int pid;
private String name;
private String city;



public person() {
	this.pid=100;
	this.name="Hari";
	this.city="chengai";
}
public person (int pid,String name,String city) {
	this.pid=pid;
	this.name="raj";
	this.city="city";
}
public person (int pid,String name) {
	this.pid=pid;
	this.name="raj";
}}