package Exersizes;
import javax.swing.JOptionPane;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Guess a number between 1 and 100000");
JOptionPane.showMessageDialog(null,"The Number is "+(1 + (int)(Math.random() * 100000)));
		JOptionPane.showMessageDialog(null, "What did you guess?");
	}

}
