public class Carro extends Veiculo {
  private int classificacaoPortaMalas; //De 0 a 10
  private int nPortas;

  public Carro(String p, String c, int cPM, int nP){
    super(p, c);
    classificacaoPortaMalas = cPM;
    nPortas = nP;
  } 

  public final int getClassificacaoPortaMalas(){
    return classificacaoPortaMalas;
  }

  public final int getNPortas(){
    return nPortas;
  }

  @Override //Método que Sobrecreve ToString da classe Object
  public String toString(){
    return "Classificação do Porta Malas: " + getClassificacaoPortaMalas() + 
    "\n" + "Numero de Portas: " + getNPortas() + "\n";
  }
}