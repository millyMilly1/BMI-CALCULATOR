
import java.util.Scanner;

import java.text.DecimalFormat;

public class BMI{
	public static void main(String[] args){
	
	System.out.println("whats is your weight in kg: ");

	Scanner input = new Scanner(System.in);
	
	double weight = input.nextDouble();
	
	System.out.println("what is your height in meters: ");
	
	double height = input.nextDouble();
	
	double BMI = weight / (height * height);
	
	DecimalFormat df = new DecimalFormat("0.00"); 
	
	System.out.println("Here's your BMI: " + df.format(BMI) + "kg/m");

	if(BMI < 18.5){
	System.out.println("you're underweight");
	}
	else if(BMI < 25.0){
	System.out.println("you're are normal");
	}
	else if(BMI < 30){
	System.out.println("you're overweight");
	}
	else{
	System.out.println("you're obese");
	}
	input.close();
}
}
