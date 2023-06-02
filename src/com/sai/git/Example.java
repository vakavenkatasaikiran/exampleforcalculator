package com.sai.git;

public class Example {
public int sub(int num1,int num2) {
	return num2-num1;
}

public static void main(String[] args) {
	Example e= new Example();
	int x=e.sub(10, 20);
	System.out.println("addition of two nnumbers"+x);
}
}
