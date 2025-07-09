package com.tnsif.day15.generics;
//Generic Class
class GenericClass<T>
{
	T data;
	void set(T data)
	{
		this.data=data;
	}
	
	T get()
	{
		return data;
	}
}