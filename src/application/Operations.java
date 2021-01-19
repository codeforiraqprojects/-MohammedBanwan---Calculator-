package application;

import javax.swing.JOptionPane;

public class Operations {
	public static double addition(double i, double j) {
		return i + j;
	}
	public static double subtraction(double i, double j) {
		return i - j;
	}
	public static double multiplication(double i, double j) {
		return i * j;
	}
	public static double division(double i, double j) {
		double z= 0;
		if(j==0) {
			JOptionPane.showMessageDialog(null, "can't divide on Zero!");
		}
		else {
			z= i / j;
		}
		return z;
	}
}
