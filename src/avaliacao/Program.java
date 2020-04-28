package avaliacao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op = 0;
		while (true) {
			System.out.println("Digite sua opção ou 0 para cancelar");
			System.out.println("Digite 1 para cadastrar cliente");
			System.out.println("Digite 2 para gerar a consulta");
			System.out.println("Digite 3 para dados do exame");
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
			
			case 2: {
				Consulta consulta = new Consulta();
				System.out.println("Digite 1 para agendar, 2 para cancelar, 3 para reagendar ou 4 para confirmar");
				int statusConsulta = scan.nextInt();
				if (statusConsulta == 4) {
					consulta.status = "confirmada";
				}else if (statusConsulta == 1) {
					consulta.status = "Agendada";
				}else if (statusConsulta == 2) {
					consulta.status = "Cancelada";
				}else if (statusConsulta == 3) {
					consulta.status = "Reagendada";
				}else {
					System.out.println("Comando inválido");
				}
				break;
			}
			
			case 3: {
				Exame exame = new Exame();
				System.out.println("Medicamentos:");
				String medicamento = scan.next();
				exame.AddMedicamento(medicamento);
				System.out.println("Vacinas:");
				String vacina = scan.next();
				exame.AddVacinas(vacina);
				System.out.println("Encaminhamentos:");
				String encaminhamento = scan.next();
				exame.AddEncaminhamentos(encaminhamento);
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
		}
		scan.close();
	}

}
