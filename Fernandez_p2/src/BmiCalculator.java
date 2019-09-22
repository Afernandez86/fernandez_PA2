import java.util.Scanner;

public class BmiCalculator {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int choice;
		
		do {

		System.out.println("Select a menu option");
		System.out.println();
		System.out.println("*****BMI Calculator Menu*****");
		System.out.println("1. Pound/Inches Calculator");
		System.out.println("2. Kilograms/Centimeters Calculator");
		System.out.println("3. Exit Menu");
		
		choice = keyboard.nextInt();
		
		switch(choice) {
		case 1:
			//Inches and Pounds BMI Calculator	
			double weightInPounds, heightInInches;
			double bmiPoundInches;
			System.out.println("You selected the Pound/Inches calculator");
			//prompt the user for heightInInches
			System.out.println("Enter your height (in inches): ");
			//get users heightInInches
			heightInInches = keyboard.nextDouble();
			//print user heightInInches
			System.out.println("Height: " + heightInInches + "in");
			System.out.println();
			
			//prompt the user for weightInPounds
			System.out.println("Enter your weight (in pounds): ");
			//get users weightInPound
			weightInPounds = keyboard.nextDouble();
			//print user weightInPounds
			System.out.println("Weight: " + weightInPounds + "lbs");
			System.out.println();
			
			//calculate BMI using pounds and inches
			bmiPoundInches = (703 * weightInPounds) / Math.pow(heightInInches, 2);
			//print out the result of bmiPoundInches
			System.out.println("Your BMI is: "+ Math.round(bmiPoundInches * 10) / 10.0);
			
			//print out BMI categories
			System.out.println("**BMI Categories**");
			System.out.println("Underweight =< 18.5");
			System.out.println("Normal Weight = 18.5-24.9");
			System.out.println("Overweight = 25-29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			System.out.println();
			System.out.println();
			break;
			
		case 2:
			//Meters and Kilograms BMI Calculator
			double weightInKilograms, heightInCentimeters;
			double bmiKilogramsCentimeters;
			System.out.println("You selected the Kilograms/Centimeters calculator");
			//prompt the user for heightInCentimeters
			System.out.println("Enter your height (in centimeters): ");
			//get users heightInCentimeters
			heightInCentimeters = keyboard.nextDouble();
			//print user heightInCentimeters
			System.out.println("Height: " + heightInCentimeters + "cm");
			System.out.println();
			
			//prompt the user for weightInKilograms
			System.out.println("Enter your weight (in kilograms): ");
			//get users weightInKilograms
			weightInKilograms = keyboard.nextDouble();
			//print user weightInKilograms
			System.out.println("Weight: " + weightInKilograms + "kg");
			System.out.println();
			
			//calculate BMI using kilograms and centimeters
			bmiKilogramsCentimeters = weightInKilograms / Math.pow(heightInCentimeters, 2);
			//print out the result of bmiKilogramsCentimeters
			System.out.println("Your BMI is: "+ Math.round(bmiKilogramsCentimeters * 100000) / 10.0);
			
			//print out BMI categories
			System.out.println("**BMI Categories**");
			System.out.println("Underweight =< 18.5");
			System.out.println("Normal Weight = 18.5-24.9");
			System.out.println("Overweight = 25-29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			System.out.println();
			System.out.println();
			break;
			
		case 3: 
			//exit statement
			System.out.println("You Exited the Menu");
			break;
			
		default:
			//wrong menu choice prompt
			System.out.println("SELECT A VALID MENU OPTION");
			break;
		}	
		
		
		}while(choice != 3);
		
		
//		Scanner keyboard = new Scanner(System.in);
		
//		//Inches and Pounds BMI Calculator	
//		double weightInPounds, heightInInches;
//		double bmiPoundInches;
//		
//		//prompt the user for heightInInches
//		System.out.println("Enter your height (in inches): ");
//		//get users heightInInches
//		heightInInches = keyboard.nextDouble();
//		//print user heightInInches
//		System.out.println("Height: " + heightInInches + "in");
//		System.out.println();
//		
//		//prompt the user for weightInPounds
//		System.out.println("Enter your weight (in pounds): ");
//		//get users weightInPound
//		weightInPounds = keyboard.nextDouble();
//		//print user weightInPounds
//		System.out.println("Weight: " + weightInPounds + "lbs");
//		System.out.println();
//		
//		//calculate BMI using pounds and inches
//		bmiPoundInches = (703 * weightInPounds) / Math.pow(heightInInches, 2);
//		//print out the result of bmiPoundInches
//		System.out.print("Your BMI is: "+ Math.round(bmiPoundInches * 10) / 10.0);		
		
		
//		Scanner keyboard = new Scanner(System.in);
		
//		//Meters and Kilograms BMI Calculator
//		double weightInKilograms, heightInCentimeters;
//		double bmiKilogramsCentimeters;
//		
//		//prompt the user for heightInCentimeters
//		System.out.println("Enter your height (in centimeters): ");
//		//get users heightInCentimeters
//		heightInCentimeters = keyboard.nextDouble();
//		//print user heightInCentimeters
//		System.out.println("Height: " + heightInCentimeters + "cm");
//		System.out.println();
//		
//		//prompt the user for weightInKilograms
//		System.out.println("Enter your weight (in kilograms): ");
//		//get users weightInKilograms
//		weightInKilograms = keyboard.nextDouble();
//		//print user weightInKilograms
//		System.out.println("Weight: " + weightInKilograms + "kg");
//		System.out.println();
//		
//		//calculate BMI using kilograms and centimeters
//		bmiKilogramsCentimeters = weightInKilograms / Math.pow(heightInCentimeters, 2);
//		//print out the result of bmiKilogramsCentimeters
//		System.out.print("Your BMI is: "+ Math.round(bmiKilogramsCentimeters * 100000) / 10.0);
	}
}
