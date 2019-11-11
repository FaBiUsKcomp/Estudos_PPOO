import java.util.ArrayList;

public class Lista<T> {
  private ArrayList<T> elementos;
  private int quantElementos;

  public Lista() {
    elementos = new ArrayList<T>();
    quantElementos = 0;
  }

  public final int getQuantElementos() {
    return quantElementos;
  }

  public final void insereElemento(T e){
    elementos.add(e);
  }

  public final void printElementos(){
    System.out.println("Os elementos da Lista são:");
    for(T e : elementos){
      System.out.println(e);
    }
    System.out.println();
  }
}