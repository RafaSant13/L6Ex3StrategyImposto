package controller;

import javax.swing.JOptionPane;

public class PAController implements ICalculoImposto{

	public PAController() {
		super();
	}

	@Override
	public void calcularImposto() {
		int area = Integer.parseInt(JOptionPane.showInputDialog("Insira a área total: "));
		int garagem = Integer.parseInt(JOptionPane.showInputDialog("Insira a área da garagem: "));
		float imposto = 0;
		if (garagem >0) {
			imposto = (area * 7.5f)+(garagem*2.5f);
		}
		else {
			imposto = area*8;
		}
		
		System.out.printf("Porto Alegre = R$%.2f\n", imposto);
	}

}
