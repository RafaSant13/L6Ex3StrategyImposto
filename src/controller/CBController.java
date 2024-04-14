package controller;

import javax.swing.JOptionPane;

public class CBController implements ICalculoImposto {

	public CBController() {
		super();
	}

	@Override
	public void calcularImposto() {
		int area = Integer.parseInt(JOptionPane.showInputDialog("Insira a área total: "));
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do imóvel: "));
		float imposto = area *5;
		if (idade>50) {
			imposto+= idade * 3;
		}
		else if (idade<20) {
			imposto += idade * 2;
		}
		else {
			imposto += idade * 2.5f;
		}
		System.out.printf("Curitiba = R$%.2f\n", imposto);
	}

}
