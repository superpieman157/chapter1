package exersizes;
import javax.swing.JOptionPane;
public class TacoTruck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tacos;
        final double TLACK = 5.99;
        String tacoString;
        final double TAX = .1;
        double maths;
        
        tacoString = JOptionPane.showInputDialog(null, "HOW MANY TACOS????");
        tacos = Integer.parseInt(tacoString);
        //MATHTHTHTHTHTHTHT
        // /give @p minecraft:diamond_block 64
        double totalDrama;
        
        totalDrama = tacos * TLACK;
        maths = totalDrama;
        double totalTex;
        totalTex = (maths * TAX) + maths;
        JOptionPane.showMessageDialog(null, "You Just Wasted $" + maths + " And $" + totalTex + " With Tax");
        
        JOptionPane.showMessageDialog(null, "You Made Me Rick \n" +
				"                        /~;+^;+\\         \n"
				+ "   ________(_______)_________\n" +
				"  \\                                                          |\n" + 
						"   |]==========v^^^^^^^^v====|\n" +
				" _|]   Delgado's  |     O/          |          |\n" + 
						"/+++++Tacos++|___|_____|++++|\n" + "|_________________________|\n" + 
						"     |___|                               |___|     \n");
	}

}
