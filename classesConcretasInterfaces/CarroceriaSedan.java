package classesConcretasInterfaces;

import interfaces.Carroceria;

//classe concreta para implementar a interface Carroceria
public class CarroceriaSedan implements Carroceria{

	@Override
	public void mostrarTipo() {
		System.out.println("Carroceria Sedan");
		
	}

}
