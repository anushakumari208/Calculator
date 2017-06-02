package com.onlinecalculator.calculator.maincalc;


import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
        int type;
        type=disp();
        if(type==1)
        {
        	BasicCalc calc=new BasicCalc();
        	calc.menu();
        	calc.userInputs();
        	calc.performOperation();
        }
        if(type==2)
        {
       		ScientificCalc sc=new ScientificCalc();
       		sc.menu();
        	sc.userInputs();
        	sc.performOperation();
       	}
        	
        	if(type==3)
        	{
        		StatisticCalc st=new StatisticCalc();
        		st.menu();
            	st.userInputs();
            	st.performOperation();
        	}
 
    }
        
    static int disp()
    {
    	int ch;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("**************CALCULATOR****************");
    	System.out.println("*************1.BASIC CALCULATOR************");
    	System.out.println("*************2.SCIENTIFIC CALCULATOR************");
    	System.out.println("*************3.STATISTIC CALCULATOR************");
    	System.out.println("enter your choice");
    	ch=sc.nextInt();
    	return(ch);
    	
    }
}