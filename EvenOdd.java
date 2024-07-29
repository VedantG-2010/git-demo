//1. Write a program which accepts an integer number as input from the user and
//	perform the following conditional checks:
//	a. Print Tom if number is odd and exists between 20 to 30
//	b. Print Jerry, if number is even and exists between 20 and 30

//Ans:  
import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter integer number: ");
	int number = sc.nextInt();
	
        if(number>=20 && number<=30){
            if (number % 2 == 0) {
                System.out.println("Jerry");
            } else {
                System.out.println("Tom");
            }
	}else{
		System.out.println("Entered number is not between range of 20 to 30");
	    }
        
    }
}

