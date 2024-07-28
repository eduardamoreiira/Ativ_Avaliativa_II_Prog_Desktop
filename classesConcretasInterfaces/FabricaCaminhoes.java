package classesConcretasInterfaces;

import interfaces.Assentos;
import interfaces.Carroceria;
import interfaces.Motor;
import interfaces.Rodas;
import interfaces.SistemaEletrico;
import interfaces.VeiculoFactory;
import veiculoscriacao.Veiculo;


//classe concreta para implementar a interface VeiculoFactory
public class FabricaCaminhoes implements VeiculoFactory{

	@Override
	public Motor criarMotor() {
		return new MotorCombustao();
	}

	@Override //nulo pois caminhão não tem carroceria
	public Carroceria criarCarroceria() {
		return null;
	}

	@Override
	public Rodas criarRodas() {
		return new RodasAro20();
	}

	@Override
	public Assentos criarAssentos() {
		return new AssentosTecido();
	}

	@Override
	public SistemaEletrico criarSistemaEletrico() {
		return new SistemaEletricoBasico();
	}
		
    @Override
    public Veiculo criarVeiculo() {
        return new Veiculo(criarMotor(), criarCarroceria(), criarRodas(), criarAssentos(), criarSistemaEletrico());
    }
}
