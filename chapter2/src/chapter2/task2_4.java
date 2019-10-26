package chapter2;
import java.util.Scanner;
public class task2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value in pound : ");
		double pound = input.nextDouble();
		double result = pound*.454;
		System.out.println(pound + " pound is  " + result + " kilograms");
		
	}

}
