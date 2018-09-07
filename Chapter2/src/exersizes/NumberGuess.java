package exersizes;
import java.util.Scanner; 
public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int Guess;
		
		System.out.println("Guess A Number Between 1 And 5");
		Guess = input.nextInt();
        
        int random = 1 + (int)(Math.random() * 5);
        
        int Difference = random - Guess;
        
        System.out.println("The Number Was " + random);
        
        System.out.println("The Difference Between Your Guess And The Number Was " + Difference);
	}

}
