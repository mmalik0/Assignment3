import java.util.Scanner;

import javax.swing.JOptionPane;
public class Assignment3 {
	public static void main(String[]args)
	{
		String U, P;
		U = JOptionPane.showInputDialog("Enter your user-name");// prompt the user to input the user-name.
		
		for (int i = 0; i < 3; i++ ){
			if ( U.equals("malik")){i=+3; }// loop allows three times to enter the user-name.
			                               // malik is set up as a default user-name.
			if (!U.equals("malik")){
				U = JOptionPane.showInputDialog("Enter your user-name");i++; }}// prompt the user to enter the user-name again after entering wrong input. 
		
		if (!U .equals("malik")) {
			JOptionPane.showMessageDialog(null, "Please contact your administrator to unlock your account!");// displays the message after the required number of attempts.
			System.exit(0);
			}
		
		P = JOptionPane.showInputDialog("Enter your pass-word");// prompt the user to input the pass-word.
		for (int c = 0; c < 3; c++ ){
			if (P.equals("asdf")){
			JOptionPane.showMessageDialog(null, "Wellcome " + U);c+=3; }// loop allows three times to enter the pass-word.
                                                                       // asdf is set up as a default pass-word.
		
			if (!P.equals("asdf")){
				P = JOptionPane.showInputDialog("Enter your pass-word");c++; }}// prompt the user to enter the pass-word again after entering wrong input.
		
		if (!P.equals("asdf")) {
			JOptionPane.showMessageDialog(null, "Please contact your administrator to unlock your account!");// displays the message after the required number of attempts.
			System.exit(0);
			}
		String[] choices = { "Admin", "Student", "Staff"};// after the account success it prompt user to select the account type.
		String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
		JOptionPane.showMessageDialog(null, "Welcome " + input + "!");// displays the message after selecting the account type.

       }
}