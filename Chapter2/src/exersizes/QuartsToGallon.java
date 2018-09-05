package exersizes;
import java.util.Scanner;
public class QuartsToGallon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int Quartsremaining;
        
        int quartsgallons = 4;
        
        int QuartsGivenByUser;
        
        System.out.println("How many quarts do you need?");
        Scanner inputDevice = new Scanner(System.in);
		QuartsGivenByUser = inputDevice.nextInt();
        Quartsremaining = QuartsGivenByUser % quartsgallons;
        
        System.out.println("Remaining Quarts = " + Quartsremaining);
	}

}
