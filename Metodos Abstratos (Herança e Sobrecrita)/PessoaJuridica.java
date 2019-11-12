public class PessoaJuridica extends Pessoa {
  private String cnpj;

  public PessoaJuridica(String n, String c, String cnpj) {
    super(n,c);
    this.cnpj = cnpj;
  }

  public final String getCpf(){
    return cnpj;
  }

  public double salario() {
    double valorTotal = 10000;
    double anuidade = 2000;
    return valorTotal - anuidade;
  }
}