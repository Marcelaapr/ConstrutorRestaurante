package construtor_restaurante;

public class Empresa {
	private String nome;
	private String endereco;
	
	public Empresa() {
		
	}
	
	public Empresa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}

