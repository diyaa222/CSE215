package Assignments;
import java.util.Scanner;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter weight in pounds : ");
   double weight = input.nextDouble();
   
   System.out.println("Enter height in inches : ");
   double height =  input.nextDouble();
   double height_meter = 0.0254*height;
   double result = (0.45359237*weight)/(height_meter*height_meter);
   
   System.out.println("BMI : "+result);
	}

}
