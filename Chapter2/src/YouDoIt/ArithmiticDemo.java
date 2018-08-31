package YouDoIt;
import java.util.Scanner;
public class ArithmiticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter A Number ");
		firstNumber = input.nextInt();
		
		System.out.print("Please Enter Another Number ");
		secondNumber = input.nextInt();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = (double) (sum / 2);
		
		System.out.println(firstNumber + " + " + secondNumber + " Is " + sum);
		
		System.out.println(firstNumber + " - " + secondNumber + " Is " + difference);
		
		System.out.println("The Average Of " + firstNumber + " And " + secondNumber + " Is " + average);
	}

}
