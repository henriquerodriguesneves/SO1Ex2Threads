package view;

import controller.ThreadCalc;
import javax.swing.JOptionPane;

public class Principal {

	public static void main (String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero... "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número... "));
		
		    for (int op = 0; op < 5; op++) {
		    	ThreadCalc tCalc = new ThreadCalc(a, b, op);
		    	tCalc.start();
		    }
	}

}