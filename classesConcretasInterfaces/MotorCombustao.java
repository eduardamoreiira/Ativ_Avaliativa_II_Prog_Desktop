package classesConcretasInterfaces;

import interfaces.Motor;

//classe concreta para implementar a interface motor
public class MotorCombustao implements Motor{

	@Override
	public void mostrarTipo() {
		System.out.println("Motor a combustão");
		
	}
	
}
