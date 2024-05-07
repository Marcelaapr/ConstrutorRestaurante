package construtor_restaurante;

public class Garcom extends Funcionario implements Atendimento{
	private int horasTrabalhadas;

	public Garcom () {
		
	}
	
	public Garcom(String nome, String endereco, String cargo, double salario,int horasTrabalhadas ) {
		super(nome, endereco, cargo, salario);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public void atenderMesa() {
		System.out.println("Estou atendendo o cliente!");
	}

	@Override
	public void atenderCliente() {
		System.out.println("Eu sou o Garçom estou em atendimento");
	}

	@Override
	public void realizarTarefa() {
		System.out.println("Estou servindo os clientes.");		
	}
	
	
	
}
