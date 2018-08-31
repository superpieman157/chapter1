package MessingAround;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class PopupGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String result;
		
		String HelloName;
		
        result = JOptionPane.showInputDialog(null, "Hello, How Are You?");
        
        JOptionPane.showMessageDialog(null, "That's " + result + "!");
        
       HelloName = JOptionPane.showInputDialog(null,
        "What Is Your Name?",
        "A Friendly Box",
        JOptionPane.QUESTION_MESSAGE);
       
       JOptionPane.showMessageDialog(null,  "Nice To Meet You " + HelloName + "!");
	}

}
