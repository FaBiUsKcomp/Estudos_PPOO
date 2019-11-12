public class Principal {
  public static void main(String[] args) {
    Veiculo carro = new Carro("1234", "Branco", 8,  2);
    Veiculo caminhao = new Caminhao("4321", "Vermelho", 4, "Sim");

    Garagem garagem = new Garagem();

    garagem.inserirVeiculos(carro);
    garagem.inserirVeiculos(caminhao);

    garagem.getVeiculos();
  }
}