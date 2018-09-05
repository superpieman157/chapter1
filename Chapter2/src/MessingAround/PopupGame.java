package MessingAround;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class PopupGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int result;
		
		String HelloName;
		
		boolean isGood;
		
		boolean isBad;
		
        result = JOptionPane.showConfirmDialog(null, "Hello, How Are You? Yes Is Good, No Is Bad");
        isGood = (result == JOptionPane.YES_OPTION);
        isBad = (result == JOptionPane.NO_OPTION);
        
        
        
       HelloName = JOptionPane.showInputDialog(null,
        "What Is Your Name?",
        "A Friendly Box",
        JOptionPane.QUESTION_MESSAGE);
       
       JOptionPane.showMessageDialog(null,  "Nice To Meet You " + HelloName + "!");
	}

}
