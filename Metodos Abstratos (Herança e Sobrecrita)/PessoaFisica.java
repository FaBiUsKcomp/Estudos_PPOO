public class PessoaFisica extends Pessoa {
  private String cpf;

  public PessoaFisica(String n, String c, String cpf) {
    super(n,c);
    this.cpf = cpf;
  }

  public final String getCpf(){
    return cpf;
  }

  public double salario() {
    double dia = 4.54 * 8;
    return dia * 30;
  }
}