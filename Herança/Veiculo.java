public class Veiculo {
  private String placa;
  private String cor;

  public Veiculo(String p, String c) {
    placa = p;
    cor = c;
  }

  public final String getPlaca(){
    return placa;
  }

  public final String getCor(){
    return cor;
  }

  @Override //Método que Sobrecreve ToString da classe Object
  public String toString(){
    return "Placa: " + getPlaca() + "\n" + "Cor: " + getCor() + "\n";
  }
}