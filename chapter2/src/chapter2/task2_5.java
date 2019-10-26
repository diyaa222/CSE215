package chapter2;
import java.util.Scanner;
public class task2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal  and a gratuity rate : ");
		double s = input.nextDouble();
		double g = input.nextDouble();
		double result1 = (s*g)/100;
		double result2 = result1 + s;
		System.out.println("The gratuity is $" + result1 + " and total is " + result2);
	}

}
