package br.com.ubc.atividade_avaliativa.Automovel;

public class Automovel {
	
	public String placa;
	
	private int renavam;
	
	public Automovel() {
		
	}

	public Automovel(String placa, int renavam) {
		super();
		this.placa = placa;
		this.renavam = renavam;
	}

	public int getRenavam() {
		return renavam;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}
	
	public String alterarPlaca (String placa) {
		return this.placa = placa;
	}
	
	
}
