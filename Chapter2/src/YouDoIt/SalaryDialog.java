package YouDoIt;
import javax.swing.JOptionPane;
public class SalaryDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String wageString;
        String dependentString;
        
        double wage;
        
        double weeklyPay;
        
        int dependents;
        
        final double HOURS_IN_WEEK = 10;
        
        wageString = JOptionPane.showInputDialog(null,
        		"Enter Employees Hourly Wage", "Salary Dialog 1",
        		JOptionPane.INFORMATION_MESSAGE);
        
        dependentString = JOptionPane.showInputDialog(null, "How Many Dependents", "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
        
        weeklyPay = Double.parseDouble(wageString) * 
        		HOURS_IN_WEEK;
        
        dependents = Integer.parseInt(dependentString);
        
        JOptionPane.showMessageDialog(null, "Weekly Salary Is $" + 
        weeklyPay + "\nDeductions Will Be Made For " + 
        dependents + dependents);
	}

}
