package package1;

public class BMI {
	private String name;
	private double weight;
	private double height;
	private double BMI;
	
	BMI(String n, double w, double h){
		name = n;
		weight = w;
		height = h;
	}
	
	public void calcBMI()
	{
		BMI= ((weight * 703) / (height*height));
		System.out.println("Your BMI is: " + Math.round(BMI));
	}
	
	public void scale(){
		if (BMI < 18.5)
		{
			System.out.println("You are under weight");
		}
		else if(BMI >18.5 && BMI < 24.9)
		{
			System.out.println("You are Normal");
		}
		else if (BMI >25 && BMI < 29.9)
		{
			System.out.println("You are Over weight");
		}
		else if (BMI > 30)
		{
			System.out.println("You are obese");
		}
	}

}
