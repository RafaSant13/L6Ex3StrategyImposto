package controller;

import javax.swing.JOptionPane;

public class BHController implements ICalculoImposto{

	public BHController() {
		super();
	}

	@Override
	public void calcularImposto() {
		int area = Integer.parseInt(JOptionPane.showInputDialog("Insira a área total: "));
		int quartos = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de quartos: "));
		float imposto = (area * 7) + (quartos * 4);
		System.out.printf("Belo Horizonte = R$%.2f\n", imposto);
	}

}
