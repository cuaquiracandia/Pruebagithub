package com.TheMasterMind.BasicProgramming;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a degree in farenheits: ");
		double farenheit= input.nextDouble();
		double celsius=(farenheit-32)*(5.0/9);
		System.out.println(""+farenheit+" farenheit is "+celsius+" celsius");
		
		

	}

}
