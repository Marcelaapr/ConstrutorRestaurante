package construtor_restaurante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	Restaurante r1 = new Restaurante(); //Objeto programado pelo get/set (Vazio)
	
	Restaurante r2 = new Restaurante("12.987.456/0001-44", "Outback", "RC Carnes", "Av.Pombal, 888-Manaíra"); //Objeto fixo
	
	//Funcionario f1 = new Funcionario();
	//Funcionario f2 = new Funcionario("João", "Av. Epitacio Pessoa, 44", "Cozinheiro", 1.500);
	
	Funcionario c1 = new Cozinheiro();
	Funcionario c2 = new Cozinheiro("Bruno", "Rua ABCD", "Cozinheiro", 1.500, "Garde Manger" );
	
	Funcionario g1 = new Garcom();
	Funcionario g2 = new Garcom("Paulo", "Rua Pombal,22", "Garçom", 2.000, 40);
	
	
	
	int repetir;
	//Inserindo os dados do restaurante, usando o teclado => set
	do {
		
		Funcionario ger1 = new Gerente(); 
		
		System.out.println("Escolha uma opção: ");
		System.out.println("0 - Cadastrar Restaurante");
		System.out.println("1 - Cadastrar Funcionários");
		System.out.println("2 - Cadastrar Pratos");
		System.out.println("3 - Listar Restaurante Cadastrado");
		System.out.println("4 - Listar Funcionário Fixo");
		System.out.println("5 - Listar Restaurante Fixo");
		System.out.println("6 - Cadastrar Cozinheiro");
		System.out.println("7 - Listar Cozinheiro Fixo");
		System.out.println("8 - Cadastrar Garçom");
		System.out.println("9 - Listar Garçom");
		System.out.println("10 - Cadastrar Gerente");
		
		int opcao = teclado.nextInt();
		teclado.nextLine();
		
		switch (opcao) {
			case 0:
				System.out.println("CNPJ: ");
				r1.setCnpj(teclado.nextLine());
				System.out.println("Nome Fantasia: ");
				r1.setNome(teclado.nextLine());
				System.out.println("Razão Social: ");
				r1.setRazao_social(teclado.nextLine());
				System.out.println("Endereço: ");
				r1.setEndereco(teclado.nextLine());
				System.out.println(r1.getCnpj()+ " " + r1.getNome() + " " + r1.getRazao_social() + " " + r1.getEndereco());
				break;
				
			case 1: 
				System.out.println("Digite o nome do funcionário: ");
				f1.setNome(teclado.next());
				System.out.println("Digite o cargo do funcionário: ");
				f1.setCargo(teclado.next());
				System.out.println("Digite o salário do funcionário: ");
				f1.setSalario(teclado.nextDouble());
				System.out.println(f1.getNome() + " " + f1.getCargo() + " " + f1.getSalario());
				break;
				
			case 2:
				r1.cadastrarPratos();
				break;
				
			case 3:
				System.out.println(r1.getCnpj());
				System.out.println(r1.getNome());
				System.out.println(r1.getRazao_social());
				System.out.println(r1.getEndereco());			
				break;
				
			case 4:
				System.out.println(f2.getNome());
				System.out.println(f2.getEndereco());
				System.out.println(f2.getCargo());
				System.out.println(f2.getSalario());
				break;
				
			case 5:
				System.out.println(r2.getCnpj());
				System.out.println(r2.getNome());
				System.out.println(r2.getRazao_social());
				System.out.println(r2.getEndereco());
				break;
			
			case 6: 
				System.out.println("Digite o nome do cozinheiro: ");
				c1.setNome(teclado.nextLine());
				System.out.println("Digite o endereço: ");
				c1.setEndereco(teclado.nextLine());
				System.out.println("Digite o cargo: ");
				c1.setCargo(teclado.next());
				System.out.println("Digite o salário: ");
				c1.setSalario(teclado.nextDouble());
				System.out.println(c1.getNome() + " " + c1.getEndereco() + " " + c1.getCargo() + " " + c1.getSalario());
				((Cozinheiro) c1).cozinhar();
				break;
			
			case 7:
				System.out.println(c2.getNome() + " " + c2.getEndereco() + " " + c2.getCargo() + " " + c2.getSalario());
				((Cozinheiro) c2).cozinhar();
				break;
				
			case 8:
				System.out.println("Digite o Nome do Funcionário: ");
				g1.setNome(teclado.nextLine());
				System.out.println("Digite o Endereço do Funcionário: ");
				g1.setEndereco(teclado.nextLine());
				System.out.println("Digite o cargo: ");
				g1.setCargo(teclado.next());
				System.out.println("Digite o salário: ");
				g1.setSalario(teclado.nextDouble());
				System.out.println("Horas trabalhadas: ");
				((Garcom) g1).setHorasTrabalhadas(teclado.nextInt());
				((Garcom) g1).atenderMesa();
				System.out.println(g1.getNome() + " " + g1.getEndereco() + " " + g1.getCargo() + " " + g1.getSalario() + ((Garcom) g1).getHorasTrabalhadas());
				break;
			
			case 9:
				System.out.println(g2.getNome() + " " + g2.getEndereco() + " " + g2.getCargo() + " " + g2.getSalario() + " " + ((Garcom) g2).getHorasTrabalhadas());
				break;
				
			case 10:
				System.out.println("Digite o nome do Gerente: ");
				c1.setNome(teclado.nextLine());
				System.out.println("Digite o endereço: ");
				c1.setEndereco(teclado.nextLine());
				System.out.println("Digite o cargo: ");
				c1.setCargo(teclado.next());
				System.out.println("Digite o salário: ");
				c1.setSalario(teclado.nextDouble());
				System.out.println(c1.getNome() + " " + c1.getEndereco() + " " + c1.getCargo() + " " + c1.getSalario());
				((Gerente) ger1).atenderCliente();
				((Gerente) ger1).realizarTarefa();
				break;
				
			case 11:
				System.out.println(ger1.getNome() + " " + ger1.getEndereco() + " " + ger1.getCargo() + " " + ger1.getSalario() + " " + ((Gerente) ger1).atenderCliente());
				break;
				
			default:
				System.out.println("Opção Inválida!");
		
			}
		System.out.println("Digite 0 para repetir");
		repetir = teclado.nextInt();
		}while(repetir == 0);
		}


}
