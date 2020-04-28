package avaliacao;

public class Pagamento {
	boolean isPlano = true;
	Plano plano;
	
	public void CadastraPlano(String nomePlano, String numeroPlano) {
		if (isPlano) {
			this.plano = new Plano();
			this.plano.nomePlano = nomePlano;
			this.plano.numeroPlano = numeroPlano;
		}
	}
	public boolean isPlano() {
		return this.isPlano;
	}
}
