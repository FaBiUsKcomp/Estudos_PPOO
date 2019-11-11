import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    Lista<Integer> listaInteger = new Lista<Integer>();
    listaInteger.insereElemento(1);
    listaInteger.insereElemento(5);
    listaInteger.insereElemento(4);
    listaInteger.insereElemento(3);

    Lista<Double> listaDouble = new Lista<Double>();
    listaDouble.insereElemento(2.1);
    listaDouble.insereElemento(10.9);
    listaDouble.insereElemento(1.2);
    listaDouble.insereElemento(1.0);

    Lista<String> listaString = new Lista<String>();
    listaString.insereElemento("Fabio");
    listaString.insereElemento("Marcos");
    listaString.insereElemento("Juliano");
    listaString.insereElemento("Sandy");

    listaInteger.printElementos();
    listaDouble.printElementos();
    listaString.printElementos();
  }
}