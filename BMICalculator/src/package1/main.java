package package1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = scan.nextLine();
		
		System.out.println("Enter weight(lbs)");
		double weight = scan.nextDouble();
		
		System.out.println("Enter height(Feet, inches)");
		String height = scan.next();
		
		double feet = Double.parseDouble(height.substring(0, height.indexOf(",")));
		double inches = Double.parseDouble(height.substring(height.indexOf(",")+1, height.length()));
		
		feet = feet*12;
		double height2 = feet+inches;
		
		BMI bmi = new BMI(name, weight, height2);
		bmi.calcBMI();
		bmi.scale();
		

	}

}
