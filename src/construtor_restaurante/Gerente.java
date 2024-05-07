package construtor_restaurante;

public class Gerente extends Funcionario implements Atendimento{
	
	
	@Override
	public void atenderCliente() {
		System.out.println("Eu sou o Gerente e estou atendendo!");
	}

	@Override
	public void realizarTarefa() {
		System.out.println("Estou gerenciando o restaurante.");
		
	}
	
	
	
}
