package lab1;
import java.util.Scanner;

//determining even or odd

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int a =input.nextInt();
		
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}

	}

}
