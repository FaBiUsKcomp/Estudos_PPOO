public abstract class Pessoa {
  private String nome;
  private String cidade;

  public Pessoa(String n, String c) {
    nome = n;
    cidade = c;
  }

  public final String getNome(){
    return nome;
  }

  public final String getCidade(){
    return cidade;
  }

  public abstract double salario(); //Método Abstrato

  @Override
  public String toString(){
    return "Nome: " + getNome() + "\n" + "Cidade: " + getCidade() + "\n";
  }
}