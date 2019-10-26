package lab2;

import java.util.Scanner;
 
//calculating BMI

public class Task3 {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a  =  input.nextInt();
    
    if(a<18.5) {
    System.out.println("underweight");	
    }
    else if(a>=18.5 && a<=24.9) {
    	System.out.println("you are healthy");
    }
    else if(a>=25 && a <=29.9) {
    	System.out.println("you are overweight");
    }
    else if (a>=30 && a<=39.9) {
    	System.out.println("you are obese");
    }
    }

}
