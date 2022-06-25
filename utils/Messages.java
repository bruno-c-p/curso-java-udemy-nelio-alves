package utils;

import javax.swing.JOptionPane;

public class Messages {
    
    public static int readInt(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	
	public static double readDouble(String message) {
		return Double.parseDouble(JOptionPane.showInputDialog(message));
	}
	
	public static String readString(String message) {
		return JOptionPane.showInputDialog(message);
	}

	public static char readChar(String message) {
		return JOptionPane.showInputDialog(message).toUpperCase().charAt(0);
	}
	
	public static void showMSG(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
