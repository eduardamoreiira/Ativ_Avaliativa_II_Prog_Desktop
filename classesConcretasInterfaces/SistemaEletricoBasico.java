package classesConcretasInterfaces;

import interfaces.SistemaEletrico;

//classe concreta para implementar a interface SistemaEletrico
public class SistemaEletricoBasico implements SistemaEletrico{

	@Override
	public void mostrarTipo() {
		System.out.println("Sistema elétrico básico");
		
	}


}
