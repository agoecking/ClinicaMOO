package avaliacao;

public class Cliente {
	String nomeResp;
	String telefone;
	Crianca crianca;
	private Endereco endereco;
	Pagamento pagamento;

	Cliente() {
	}

	public void Cadastrar(String nomeResp, String telefone, String rua, String bairro, String cep, int numero,
			String complemento, Pagamento pagamento, String nomeCrianca, int idade, double altura) {
		this.nomeResp = nomeResp;
		this.telefone = telefone;
		this.crianca = new Crianca();
		this.crianca.setNomeCrianca(nomeCrianca);
		this.crianca.setIdade(idade);
		this.crianca.setAltura(altura);
		this.endereco = new Endereco();
		this.endereco.rua = rua;
		this.endereco.bairro = bairro;
		this.endereco.cep = cep;
		this.endereco.numero = numero;
		this.endereco.complemento = complemento;
		this.pagamento = pagamento;
	}
}
