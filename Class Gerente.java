public class Gerente extends Funcionario {
    private int equipe;
    private double bonus;

    public Gerente(String nome, int idade, String cpf, String cargo, String dataAdmissao, double salario, int equipe, double bonus) {
        super(nome, idade, cpf, cargo, dataAdmissao, salario);
        this.equipe = equipe;
        this.bonus = bonus;
    }
    public void mostrarDados() {
        System.out.println("=== Dados do Gerente ===");
        super.mostrarDados();
        System.out.println("Equipe: " + equipe + " funcionários");
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário com Bônus: R$ " + calcularSalarioComBonus());
    }

    public double calcularSalarioComBonus() {
        return salario + bonus;
    }

    public void gerenciarEquipe() {
        System.out.println("Gerenciando uma equipe de " + equipe + " pessoas.");
    }
}
