package classesConcretasInterfaces;

import interfaces.Assentos;
import interfaces.Carroceria;
import interfaces.Motor;
import interfaces.Rodas;
import interfaces.SistemaEletrico;
import interfaces.VeiculoFactory;
import veiculoscriacao.Veiculo;


//classe concreta para implementar a interface VeiculoFactory
public class FabricaCarros implements VeiculoFactory{

	@Override
	public Motor criarMotor() {
		return new MotorCombustao();
	}

	@Override
	public Carroceria criarCarroceria() {
		return new CarroceriaSedan();
	}

	@Override
	public Rodas criarRodas() {
		return new RodasAro17();
	}

	@Override
	public Assentos criarAssentos() {
		return new AssentosTecido();
	}

	@Override
	public SistemaEletrico criarSistemaEletrico() {
		return new SistemaEletricoCompleto();
	}
	
    @Override
    public Veiculo criarVeiculo() {
        return new Veiculo(criarMotor(), criarCarroceria(), criarRodas(), criarAssentos(), criarSistemaEletrico());
    }

}
