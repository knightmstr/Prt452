package com.saugat.learn;

import java.util.Scanner;

public class ProcessingAll implements SlopeOfLine, EquationOfLine, DistanceBetweenPoints {

	@Override
	public float distance(float x1, float y1, float x2, float y2) {
		// TODO Auto-generated method stub
		return (float) Math.sqrt((x2 - x1)*(x2 - x1)+ (y2 - y1)*(y2 - y1));	
	}

	@Override
	public String equation(float x1, float y1, float slope) {
		// TODO Auto-generated method stub
		float output = y1 - (slope*x1);
		String res= "y -"+slope+"x =" +output;
		return res;
	}

	@Override
	public float slope(float x1, float y1, float x2, float y2) {
		// TODO Auto-generated method stub		
		return (y2 - y1)/(x2 - x1);
	}

	public static void main(String[] args){
		float x1, x2, y1, y2;
		float distance;
		float slope;
		String equation;
		
		final ProcessingAll calculating;
		calculating= new ProcessingAll();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the x1 coordinate: ");
		x1 = scanner.nextFloat();
		
		System.out.println("Enter the y1 coordinate: ");
		y1 = scanner.nextFloat();
		
		System.out.println("Enter the x2 coordinate: ");
		x2 = scanner.nextFloat();
		
		System.out.println("Enter the y2 coordinate: ");
		y2 = scanner.nextFloat();
		
		slope = calculating.slope(x1, y1, x2, y2);
		distance = calculating.distance(x1, y1, x2, y2);
		equation = calculating.equation(x1, y1, slope);

		System.out.println("The gradient(slope) is: "+slope+".");
		System.out.println("The distance is: "+distance+".");
		System.out.println("The equation of line is: "+equation+".");
	}

}
