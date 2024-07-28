package classesConcretasInterfaces;

import interfaces.SistemaEletrico;

//classe concreta para implementar a interface SistemaEletrico
public class SistemaEletricoCompleto implements SistemaEletrico{

	@Override
	public void mostrarTipo() {
		System.out.println("Sistema elétrico completo");
		
	}

}
