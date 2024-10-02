package com.autozone.lexington;

import jdk.internal.org.jline.terminal.TerminalBuilder;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the second class");
		System.out.println("The sum of two numbers "+ addTwoNumber(10,12));
	}
	public static int addTwoNumber(int a, int b){
		int c = a + b;
		return c;
	}
}
