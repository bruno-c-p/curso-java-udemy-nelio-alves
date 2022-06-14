package utils;

import javax.swing.JOptionPane;

public class Mensagens {
    
    public static int leInteiro(String mensagem) {
		return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
	}
	
	public static double leDouble(String mensagem) {
		return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
	}
	
	public static String leString(String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}
	
	public static void mostraMSG(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
}
