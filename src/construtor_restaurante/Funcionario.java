package construtor_restaurante;

public abstract class Funcionario extends Empresa {
	
	private String cargo;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String endereco, String cargo, double salario) {
		super(nome, endereco);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void cadastrarFuncionario() {
		System.out.println("Cadastrando Funcionários...");
		
	}
	
	public abstract void realizarTarefa();
	
}

