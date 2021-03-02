package com.TheMasterMind.BasicProgramming;

import java.util.Scanner;

public class ComputerAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 3 variables: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		int average=(a+b+c)/3;
		
		System.out.println("The Average of "+a+" "+b+" "+c+" is "+average);
				
		
		

	}

}
