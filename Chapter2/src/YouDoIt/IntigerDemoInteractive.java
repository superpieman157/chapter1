package YouDoIt;
import java.util.Scanner;
public class IntigerDemoInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int anInt  ;
        
        byte aByte  ;
        
        short aShort  ;
        
        long aLong  ;
        
        String name;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What Is Your Name? ");
        name = input.next();
        
        System.out.println("Please Enter An Integer ");
        anInt = input.nextInt();
        
        System.out.println("Please Enter A Byte ");
        aByte = input.nextByte();
        
        System.out.println("Please Enter A Short ");
        aShort = input.nextShort();
        
        System.out.println("Please Enter A Long ");
        aLong = input.nextLong();
        
        System.out.println("Your Name Is " + name);
        
        System.out.println("The Int Is " + anInt);
        
        System.out.println("The Byte Is " + aByte);
        
        System.out.println("The Short Is " + aShort);
        
        System.out.println("The Long Is " + aLong);
       
	}

}
