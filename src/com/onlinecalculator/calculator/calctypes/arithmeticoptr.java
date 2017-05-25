package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class arithmeticoptr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		a=sc.nextInt();
		System.out.println("enter b number");
		b=sc.nextInt();
		System.out.println("addition"+(a+b));
		System.out.println("subtraction"+(a-b));
		System.out.println("multiply"+(a*b));
		System.out.println("divide"+(a/b));
		System.out.println("modulus"+(a%b));
}
}