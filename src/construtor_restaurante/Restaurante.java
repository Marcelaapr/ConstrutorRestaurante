package construtor_restaurante;

public class Restaurante extends Empresa {
	private String cnpj;
	private String razao_social;
	
	public Restaurante() { //Construtor vazio vai dar conta do objeto VAZIO, que não são fixos.
		
	}
	
	public Restaurante(String cnpj, String nome, String razao_social, String endereco) { // Construtor preenchido, que da conta dos objetos FIXOS.
		super(nome, endereco);
		this.cnpj = cnpj;
		this.razao_social = razao_social;
	}
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}


	//Métodos:
	
	
	public void cadastrarPratos() {
		System.out.println("Cadastrando pratos");
	}
}
