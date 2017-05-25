package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class assignmentoptr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		a=sc.nextInt();
		System.out.println("enter b number");
		b=sc.nextInt();
		System.out.println("a+=b is" +(a+=b));
		System.out.println("a-=b is" +(a-=b));
		System.out.println("a*=b is" +(a*=b));
		System.out.println("a/=b is" +(a/=b));
		System.out.println("a%=b is" +(a%=b));
		
	}

}
