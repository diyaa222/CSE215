package lab2;
import java.util.Scanner;

//determining Prime Number

public class Task2 {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int a = input.nextInt();
     int flag = 1;
     
    for(int i=2;i<a; i++) {
    	if(a%i==0) {
    		flag = 0;
    		break;
    	}
    	else if (a%i!=0) {
    		flag = 1;
    	}
    }
    
    if(flag == 0) {
    	System.out.println("Not Prime Number");
    }
    else if(flag == 1) {
    System.out.println("Prime Number");
    }
	}

}
