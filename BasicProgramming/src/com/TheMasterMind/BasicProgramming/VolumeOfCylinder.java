package com.TheMasterMind.BasicProgramming;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Provide value of radius: ");
		double r=input.nextDouble();
		System.out.println("Provide value of heigh: ");
		double h=input.nextDouble();
		
		double volume=3.14159*r*r*h;
		System.out.println("The volume of cylinder of radius "+r+" and heigh "+h+" is "+volume);	
	}

}
