package avaliacao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op = 0;
		while (true) {
			System.out.println("Digite sua opção ou 0 para cancelar");
			System.out.println("Digite 1 para cadastrar cliente");
			op = scan.nextInt();
			if (op == 0) {
				break;
			}
			
			switch (op) {
			case 1: {
				Cliente cliente = new Cliente();
				System.out.println("Insira o nome do cliente");
				String nomeResp = scan.next();
				System.out.println("Insira o telefone");
				String telefone = scan.next();
				System.out.println("Insira a altura da criança");
				double altura = scan.nextDouble();
				System.out.println("Insira a idade da criança");
				int idade = scan.nextInt();
				System.out.println("insira o nome da criança");
				String nomeCrianca = scan.next();
				System.out.println("insira o bairro");
				String bairro = scan.next();
				System.out.println("insira o CEP");
				String cep = scan.next();
				System.out.println("Insira o complemento");
				String complemento = scan.next();
				System.out.println("Insira o numero");
				int numero = scan.nextInt();
				System.out.println("Insira a rua");
				String rua = scan.next();
				System.out.println("Pagamento será com plano? s/n");
				String soun = scan.next();
				Pagamento pagamento = new Pagamento();
				if (soun.equalsIgnoreCase("s")) {
					pagamento.isPlano = true;
					System.out.println("Insira o nome do plano");
					String nomePlano = scan.next();
					System.out.println("Insira o numero do plano");
					String numeroPlano = scan.next();
					pagamento.CadastraPlano(nomePlano, numeroPlano);
				}
				
				cliente.Cadastrar(nomeResp, telefone, rua, bairro, cep, numero, complemento, pagamento, nomeCrianca, idade, altura);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
		}
		scan.close();
	}

}
