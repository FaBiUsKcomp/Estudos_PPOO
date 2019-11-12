public class Caminhao extends Veiculo {
  private int nEixos;
  private String trucado;  //Sim ou Não

  public Caminhao(String p, String c, int nE, String t) {
    super(p, c);
    nEixos = nE;
    trucado = t;
  }

  public final int getnEixos(){
    return nEixos;
  }

  public final String getTrucado(){
    return trucado;
  }

  @Override //Método que Sobrecreve ToString da classe Object
  public String toString(){
    return "Numero de Eixos: " + getnEixos() + "\n" + "Trucado: " + getTrucado() + "\n";
  }
}