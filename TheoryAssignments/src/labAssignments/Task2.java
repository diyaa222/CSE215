package labAssignments;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of students : ");
    int n = input.nextInt();
    
    for (int i = 1; i <=n; i++) {
    	System.out.println("Please enter the mark of student " + i);
    	int mark = input.nextInt();
    	if(mark >= 93 )
    	{
    		System.out.println("Student " + i + "has a grade of A" );
    	}
    	else if(mark >=90 && mark<93 ) {
    		System.out.println("Student " + i + "has a grade of A-" );
    	}
    	else if(mark >=87 && mark<90 ) {
    		System.out.println("Student " + i + "has a grade of B+" );
    	}
    	else if(mark >=83 && mark<86 ) {
    		System.out.println("Student " + i + "has a grade of B" );
    	}
    	else if(mark >=80 && mark<83 ) {
    		System.out.println("Student " + i + "has a grade of B-" );
    	}
    	else if(mark >=77 && mark<80 ) {
    		System.out.println("Student " + i + "has a grade of C+" );
    	}
    	else if(mark >=73 && mark<77 ) {
    		System.out.println("Student " + i + "has a grade of C" );
    	}
    	else if(mark >=70 && mark<73 ) {
    		System.out.println("Student " + i + "has a grade of C-" );
    	}
    	else if(mark >=67 && mark<70 ) {
    		System.out.println("Student " + i + "has a grade of D+" );
    	}
    	else if(mark >=60 && mark<67 ) {
    		System.out.println("Student " + i + "has a grade of D" );
    	}
    	else if(mark<60 ) {
    		System.out.println("Student " + i + "has a grade of F" );
    	}
    	
	}
    
    System.out.println("Program Terminated");
    
	}

}
