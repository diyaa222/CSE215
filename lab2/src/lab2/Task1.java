package lab2;
import java.util.Scanner;

//determining even or odd using switch

public class Task1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int a = input.nextInt();
		
		switch(a%2) {
		case 0 : 
			System.out.println("even");
			break;
		case 1 : 
			System.out.println("odd");
		
		}
	}

}
