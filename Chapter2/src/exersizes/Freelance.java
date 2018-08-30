package exersizes;
import java.util.Scanner;
public class Freelance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
		
        System.out.println("Please Enter Your Name ");
        name = input.next();
        
        System.out.println("Please anter a number ");
        num1 = input.nextInt();
        
        System.out.println("Please Enter Another Number ");
        num2 = input.nextInt();
        
        int total = num1 + num2;
        
        System.out.println("Your Name Is " + name);
        
        System.out.println("Your Total Is " + total);
        
        
        
	}

}
