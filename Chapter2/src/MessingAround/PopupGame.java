package MessingAround;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.util.Scanner;
public class PopupGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int result;
		
		String HelloName;
		
		boolean isGood;
		
		boolean isBad;
		
       HelloName = JOptionPane.showInputDialog(null,
        "What Is Your Name?",
        "A Friendly Box",
        JOptionPane.QUESTION_MESSAGE);
       
       Object[] options = {"It Was Good",
               "I've Had A Bad Day",
               "Go Away"};
Component frame = null;
int n = JOptionPane.showOptionDialog(frame,
"How Was Your Day",
HelloName, JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[2]);
       
       JOptionPane.showMessageDialog(null,  "Nice To Meet You " + HelloName + "!");
       System.out.println("       _.--.__                                             _.--.\r\n" + 
       		"    ./'       `--.__                                   ..-'   ,'\r\n" + 
       		"  ,/               |`-.__                            .'     ./\r\n" + 
       		" :,                 :    `--_    __                .'   ,./'_.....\r\n" + 
       		" :                  :   /    `-:' _\\.            .'   ./..-'   _.'\r\n" + 
       		" :                  ' ,'       : / \\ :         .'    `-'__...-'\r\n" + 
       		" `.               .'  .        : \\@/ :       .'       '------.,\r\n" + 
       		"    ._....____  ./    :     .. `     :    .-'      _____.----'\r\n" + 
       		"              `------------' : |     `..-'        `---.\r\n" + 
       		"                         .---'  :    ./      _._-----'\r\n" + 
       		".---------._____________ `-.__/ : /`      ./_-----/':\r\n" + 
       		"`---...--.              `-_|    `.`-._______-'  /  / ,-----.__----.\r\n" + 
       		"   ,----' ,__.  .          |   /  `\\.________./  ====__....._____.'\r\n" + 
       		"   `-___--.-' ./. .-._-'----\\.                  ./.---..____.--.\r\n" + 
       		"         :_.-' '-'            `..            .-'===.__________.'\r\n" + 
       		"                                 `--...__.--'");
	}

}
