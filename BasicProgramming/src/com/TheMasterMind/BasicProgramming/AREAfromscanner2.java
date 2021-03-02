package com.TheMasterMind.BasicProgramming;

import java.util.Scanner;

public class AREAfromscanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		double radio,area;
		//constantes
		final double pi=3.14169;
		//leer
		Scanner input=new Scanner(System.in);
		System.out.println("Provide value of the radius: ");
		radio=input.nextDouble();
		area=radio*radio*pi;
		//salida
		System.out.println("The area for the circle of radius "+radio+" is "+area);
	}

}
