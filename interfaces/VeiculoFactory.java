package interfaces;

import veiculoscriacao.Veiculo;

//interface para Veiculo Factory (fábrica de veículos)
public interface VeiculoFactory {
	
	Motor criarMotor();
	Carroceria criarCarroceria();
	Rodas criarRodas();
	Assentos criarAssentos();
	SistemaEletrico criarSistemaEletrico();
	Veiculo criarVeiculo();
	
}
