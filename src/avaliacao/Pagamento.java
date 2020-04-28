package avaliacao;

public class Pagamento {
	private boolean isPlano = true;
	Plano plano;
	
	public void CadastraPlano(String nomePlano, String numeroPlano) {
		if (isPlano()) {
			this.plano = new Plano();
			this.plano.setNomePlano(nomePlano);
			this.plano.setNumeroPlano(numeroPlano);
		}
	}
	public boolean isPlano() {
		return this.isPlano;
	}
	public void setPlano(boolean isPlano) {
		this.isPlano = isPlano;
	}
}
