public class Funcionario extends Pessoa {
    protected String cargo;
    protected String dataAdmissao;
    protected double salario;

    public Funcionario(String nome, int idade, String cpf, String cargo, String dataAdmissao, double salario) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public void mostrarDados() {
        System.out.println("=== Dados do Funcionário ===");
        super.mostrarDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Salário: R$ " + salario);
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public void receberAumento(double porcentagem) {
        salario += salario * (porcentagem / 100);
    }
}
