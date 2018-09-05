package exersizes;
import java.util.Scanner;
public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String WordOne;
        String WordTwo;
        String WordThree;
        
        Scanner input = new Scanner(System.in);;
        
        System.out.println("Enter a Place");
		WordOne = input.next();
        
        System.out.println("Enter A Past Tense Action");
        WordTwo = input.next();
        
        System.out.println("Enter A One Word Phrase");
        WordThree = input.next();
        
        System.out.println("James Went To " + WordOne + " And Then He " + WordTwo + " And Said " + WordThree + " For No Reason");
        
	}

}
