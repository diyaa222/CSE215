package chapter2;
import java.util.Scanner;
public class task2_1 {

	public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a degree in celsious : ");
  double a = input.nextDouble();
  double farenheit = (9.0/5) * a +32;
  System.out.println(a + " Celsius is " + farenheit +" Farenheit ");
	}

}
