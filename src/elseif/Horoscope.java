package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String sign = JOptionPane.showInputDialog("What is your star sign");
	if(sign.equals("Aries")){
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will have a great week");
	} else if(sign.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will have a boring week");
	} else if(sign.equals("Gemini")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will make a lot of money today");
	} else if(sign.equals("cancer")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will get into some trouble this week");
	} else if(sign.equals("Leo")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will have a lot of fun these next couple weeks");
	} else if(sign.equals("Virgo")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will have a fun summer");
	} else if(sign.equals("Libra")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will have a fun summer");
	} else if(sign.equals("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will have a fun summer");
	} else if(sign.equals("Sagittarius")){
		JOptionPane.showMessageDialog(null, "Your Horoscope: You have a great relationship");
	} else if(sign.equals("Capricorn")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will have a fun summer");
	} else if(sign.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will have a great summer");
	} else if(sign.equals("Pisces")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope: You will have a great summer");
	} else {
		JOptionPane.showMessageDialog(null, "That's not a star sign!");
	}
	}
}

