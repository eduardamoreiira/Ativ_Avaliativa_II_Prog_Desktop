package classesConcretasInterfaces;

import interfaces.Carroceria;

//classe concreta para implementar a interface Carroceria
public class CarroceriaHatch implements Carroceria {

	@Override
	public void mostrarTipo() {
		System.out.println("Carroceria Hatch");
		
	}

}
