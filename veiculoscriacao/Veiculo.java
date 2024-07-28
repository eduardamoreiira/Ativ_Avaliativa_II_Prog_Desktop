package veiculoscriacao;

import interfaces.Assentos;
import interfaces.Carroceria;
import interfaces.Motor;
import interfaces.Rodas;
import interfaces.SistemaEletrico;

public class Veiculo {
	
	private Motor motor;
    private Carroceria carroceria;
    private Rodas rodas;
    private Assentos assentos;
    private SistemaEletrico sistemaEletrico;
    
    public Veiculo(Motor motor, Carroceria carroceria, Rodas rodas, Assentos assentos, SistemaEletrico sistemaEletrico) {
        this.motor = motor;
        this.carroceria = carroceria;
        this.rodas = rodas;
        this.assentos = assentos;
        this.sistemaEletrico = sistemaEletrico;
    }

    public void exibirDetalhes() {
        motor.mostrarTipo();
        if (carroceria != null) {
            carroceria.mostrarTipo();
        }
        rodas.mostrarTamanhoAro();
        assentos.mostrarTipo();
        sistemaEletrico.mostrarTipo();
    }
}
