package com.tnsif.day12;
import java.io.IOException;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str = CheckedException.acceptText();// reads line from console
			System.out.println("Your string is " + str);
		} catch (IOException e) {
			System.err.println("An error occurred while reading input: " + e.getMessage());
		}
	}

}
