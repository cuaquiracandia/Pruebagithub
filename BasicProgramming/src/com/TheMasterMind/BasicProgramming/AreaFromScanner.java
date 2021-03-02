package com.TheMasterMind.BasicProgramming;

import java.util.Scanner;

public class AreaFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		double radio,area;
		final double pi=3.14169;
		System.out.println("Provide value of the radius: ");
		radio=input.nextDouble();
		
		area=radio*radio*pi;
		//OUT
		System.out.println("The area for the circle of radius " +radio+ " is " +area);
	}

}
