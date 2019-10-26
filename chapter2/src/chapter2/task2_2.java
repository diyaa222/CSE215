package chapter2;
import java.util.Scanner;
public class task2_2 {

	public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the radius : ");
  double radius = input.nextDouble();
  System.out.println("Enter the length : ");
  double length = input.nextDouble();
  
  double area = radius * radius * Math.PI ;
  double volume = area * length ;
  
  System.out.println("The area is " + area);
  System.out.println("The volume is " + volume);
	}

}
