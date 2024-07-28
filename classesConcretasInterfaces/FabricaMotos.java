package classesConcretasInterfaces;

import interfaces.Assentos;
import interfaces.Carroceria;
import interfaces.Motor;
import interfaces.Rodas;
import interfaces.SistemaEletrico;
import interfaces.VeiculoFactory;
import veiculoscriacao.Veiculo;


//classe concreta para implementar a interface VeiculoFactory
public class FabricaMotos implements VeiculoFactory{

	@Override
	public Motor criarMotor() {
		return new MotorEletrico();
	}

	@Override //nulo pois moto não tem carroceria
	public Carroceria criarCarroceria() {
		return null;
	}

	@Override
	public Rodas criarRodas() {
		return new RodasAro17();
	}

	@Override
	public Assentos criarAssentos() {
		return new AssentosCouro();
	}

	@Override //nulo pois moto não possui sistema elétrico
	public SistemaEletrico criarSistemaEletrico() {
		return new SistemaEletricoBasico();
	}
	
    @Override
    public Veiculo criarVeiculo() {
        return new Veiculo(criarMotor(), criarCarroceria(), criarRodas(), criarAssentos(), criarSistemaEletrico());
    }

}
