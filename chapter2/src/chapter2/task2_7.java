package chapter2;
import java.util.Scanner;
public class task2_7 {

	public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the number of minutes : ");
   double min = input.nextDouble();
   double year = min*(1.0/525600);
   System.out.println(year);
	}

}
