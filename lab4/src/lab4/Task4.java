package lab4;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Enter  String 1 : ");
    String s1 = input.nextLine();
    System.out.println("Enter String String 2 : ");
    String s2 = input.nextLine();
    
    if(s1.startsWith(s2) || s1.contains(s2) ) {
    	System.out.println("true ");
       System.out.println(s1.equalsIgnoreCase(s2));
    }
    else {
    	System.out.println("false");
    }
    	
    
	}

}
