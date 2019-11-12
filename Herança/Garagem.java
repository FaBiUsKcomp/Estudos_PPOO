import java.util.ArrayList;

public class Garagem {
  private ArrayList<Veiculo> veiculos;

  public Garagem(){
    veiculos = new ArrayList<Veiculo>();
  }

  public final void inserirVeiculos(Veiculo v){
    veiculos.add(v);
  }

  public void getVeiculos(){
    System.out.println("Seus Veículos são:");
    System.out.println();
    
    for(Veiculo v : veiculos){
      System.out.println(v);
    }
    System.out.println();
  }
}