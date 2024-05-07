package construtor_restaurante;

public class Cozinheiro extends Funcionario{
	private String especializacao;
	
	public Cozinheiro() {
		super();
		
	}

	public Cozinheiro(String nome, String endereco, String cargo, double salario, String especializacao) {
		super(nome, endereco, cargo, salario);
		
	}
	
	public void cozinhar() {
		System.out.println("Estou cozinhando!");
	}

	@Override
	public void realizarTarefa() {
		System.out.println("Estou fazendo o pré-preparo das comidas.");
	}
	
	
}
