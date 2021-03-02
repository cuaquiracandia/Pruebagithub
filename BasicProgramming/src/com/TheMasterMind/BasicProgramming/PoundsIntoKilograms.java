package com.TheMasterMind.BasicProgramming;

import java.util.Scanner;

public class PoundsIntoKilograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a measure in pounds: ");
		double pound=input.nextDouble();
		double kilogram=pound*(453.0/1000);
		System.out.println(""+pound+" pounds is " +kilogram+ " kilograms");
		
	}

}
