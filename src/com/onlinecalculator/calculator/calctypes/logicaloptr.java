package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class logicaloptr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Boolean a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
a=sc.nextBoolean();
System.out.println("enter b number");
b=sc.nextBoolean();
System.out.println("a&&b="+(a&&b));
System.out.println("a||b="+(a||b));
System.out.println("!(a&&b)="+!(a&&b));
}
}