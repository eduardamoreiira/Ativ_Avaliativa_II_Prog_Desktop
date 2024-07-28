package classesConcretasInterfaces;

import interfaces.Assentos;

//classe concreta para implementar a interface Assentos
public class AssentosCouro implements Assentos{

	@Override
	public void mostrarTipo() {
		System.out.println("Assento de couro");
		
	}

}
