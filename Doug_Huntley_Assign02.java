

import javax.swing.JOptionPane;

public class Doug_Huntley_Assign02 
{
	
	public static void main(String[] args) 
	{
		String firstName;
		char middleInitial;
		String lastName;
		int age;
		double grossAnnualPay;
		double taxRate;
		double netAnnualPay;
    
		firstName = JOptionPane.showInputDialog("Enter your first name:");
		String middleInitialStr = JOptionPane.showInputDialog("Enter your middle initial:");
		middleInitial = middleInitialStr.charAt(0);
		lastName = JOptionPane.showInputDialog("Enter your last name:");
		age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
		grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("Enter your gross annual pay:"));
        taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter your tax rate (e.g., 0.30 for 30%):"));

        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);

        System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ",");
        System.out.println("You are " + age + " years old now.");
        System.out.println("It is amazing that you made $" + String.format("%.2f", grossAnnualPay) + " this year.");
        System.out.println("With the tax rate of " + taxRate + ", you can take home $" + String.format("%.2f", netAnnualPay) + ".");
		
	}

}
