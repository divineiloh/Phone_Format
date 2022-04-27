	//Author: Divine Iloh
	//BINS 5312
	//Date: 04/03/2022

package PhoneNumberFormat;

import javax.swing.JOptionPane;
public class PhoneNumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define variables
		String number;
		char bracket1 = '(';
		char bracket2 = ')';
		char space = ' ';
		char hyphen = '-';
		boolean is999 = false;
		
		
		
		while (is999 == false)
		{
			//request input from user
			number = JOptionPane.showInputDialog("Enter your phone number");
			int IntNum = (Integer.parseInt(number));
			
			//determine if user wants to exit dialog box
			if (IntNum == 999)
			{
				is999 = true;
				JOptionPane.showMessageDialog(null, "User opted out");
			}
			
			else
			{
				if (number.matches("[0-9]+"))
				{
					
					//determine if number equals 10
					if (number.length() == 10)
					
					{
						//create string buffer to insert
						StringBuffer phoneNum = new StringBuffer(number);
					
						phoneNum.insert(0, bracket1);
						phoneNum.insert(4, bracket2);
						phoneNum.insert(5, space);
						phoneNum.insert(9, hyphen);
					
						String msg = ("Your phone number is " + phoneNum);
						JOptionPane.showConfirmDialog(null, msg);
					}
			
					else
					{
						JOptionPane.showMessageDialog(null, "Entry must be equal to ten");
					}
					
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Entry must be digits alone");
				}
		
			}
		}
	}
}
