package Assignments;
import java.util.Scanner;
public class number1 {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    System.out.println("Enter an integer between 0 and 1000 : ");
    int n =input.nextInt();
    if(n>=0 && n<=1000) {
    while(n!=0) {
        sum = sum + n % 10;
        n = n/10;
    }
    System.out.println("The sum of the digits is : " + sum);
   } 
	}

}

