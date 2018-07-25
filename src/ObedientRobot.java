import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What shape would you like?");
		if (answer.equals("Square")) {
			drawSquare();
		} else if (answer.equals("Triangle")) {
			drawTriangle();
		} else if (answer.equals("Circle")) {
			drawCircle();
		}
		
		
		
	}

	public static void drawSquare() {
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(30);
		for (int i = 0; i < 4; i++) {
			r2d2.move(100);
			r2d2.turn(90);
		}
	}

	public static void drawTriangle() {
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(30);
		for (int i = 0; i < 3; i++) {
			r2d2.move(100);
			r2d2.turn(120);
		}
	}

	public static void drawCircle() {
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(30);
		for (int i = 0; i < 360; i++) {
			r2d2.move(1);
			r2d2.turn(1);

		}
	}
}