package chapter2;
import java.util.Scanner;
public class task2_3 {

	public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a value for feet : ");
   
   double f =input.nextDouble();
   double result=f*.305;
   System.out.println(f +" Feet is " + result + " meters");
	}

}
