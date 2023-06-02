package com.sai.git;

public class Example {
public int add(int num1,int num2) {
	return num1+num2;
}

public static void main(String[] args) {
	Example e= new Example();
	int x=e.add(10, 20);
	System.out.println("addition of two nnumbers"+x);
}
}
