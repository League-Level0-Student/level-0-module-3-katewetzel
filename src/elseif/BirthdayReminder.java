
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August 4th";
		String dadsBirthday = "December 18th";
		String myBirthday = "November 27th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer = JOptionPane.showInputDialog("Who's birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
		if(answer.equals("mom")) {
			System.out.println(momsBirthday);
		} else if (answer.equals("dad")) {
			System.out.println(dadsBirthday);
		} else if(answer.equals("you")) {
			System.out.println(myBirthday);
		} else {
			System.out.println("Sorry I don't remember that person's birthday!");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
