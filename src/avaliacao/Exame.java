package avaliacao;

import java.util.ArrayList;

public class Exame {
	ArrayList<String> Medicamentos = new ArrayList<>();
	ArrayList<String> Vacinas = new ArrayList<>();
	ArrayList<String> Encaminhamentos = new ArrayList<>();
	
	public void AddMedicamento (String medicamento) {
		Medicamentos.add(medicamento);
	}
	public void AddVacinas (String vacina) {
		Vacinas.add(vacina);
	}
	public void AddEncaminhamentos (String encaminhamento) {
		Encaminhamentos.add(encaminhamento);
	}
}
