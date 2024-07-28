package veiculoscriacao;

import classesConcretasInterfaces.FabricaCaminhoes;
import classesConcretasInterfaces.FabricaCarros;
import classesConcretasInterfaces.FabricaMotos;
import interfaces.VeiculoFactory;

public class CriacaoDeVeiculos {

    public static void main(String[] args) {
        VeiculoFactory fabricaCarros = new FabricaCarros();
        VeiculoFactory fabricaMotos = new FabricaMotos();
        VeiculoFactory fabricaCaminhoes = new FabricaCaminhoes();

        System.out.println("Produzindo um Carro:");
        Veiculo carro = fabricaCarros.criarVeiculo();
        carro.exibirDetalhes();

        System.out.println("\nProduzindo uma Moto:");
        Veiculo moto = fabricaMotos.criarVeiculo();
        moto.exibirDetalhes();

        System.out.println("\nProduzindo um Caminhão:");
        Veiculo caminhao = fabricaCaminhoes.criarVeiculo();
        caminhao.exibirDetalhes();
    }
}

