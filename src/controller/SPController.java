package controller;

import javax.swing.JOptionPane;

public class SPController implements ICalculoImposto{

	public SPController() {
		super();
	}

	public void calcularImposto() {
		int area = Integer.parseInt(JOptionPane.showInputDialog("Insira a área total: "));
		int comodos = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de cômodos: "));
		float imposto = (area * 10) + (comodos * 2);
		System.out.printf("São Paulo = R$%.2f\n", imposto);
	}
	

}
