package view;

import controller.BHController;
import controller.CBController;
import controller.PAController;
import controller.SPController;

public class Teste {

	public static void main(String[] args) {
		SPController sp = new SPController();
		BHController bh = new BHController();
		PAController pa = new PAController();
		CBController cb = new CBController();
		sp.calcularImposto();
		bh.calcularImposto();
		pa.calcularImposto();
		cb.calcularImposto();
	}

}
