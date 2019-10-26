package labAssignments;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter the integers : ");
		  int a = input.nextInt();
		  int b = input.nextInt();
		  int c = input.nextInt();
		  double numerator = (2*a+3*b) * (Math.sqrt(c*c*c + a*a*a*a*a*a));
		  
		  double denominator = Math.exp(Math.tan((a*a)/((b*b*b) + (4*Math.sqrt(c)))));
		  double result = numerator/denominator;
		  System.out.println("Result is " + result);
  
	}

}
