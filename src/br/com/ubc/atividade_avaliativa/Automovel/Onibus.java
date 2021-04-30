package br.com.ubc.atividade_avaliativa.Automovel;

public class Onibus extends Automovel{
	
	private String empresa;
	
	private String periodoCirculacao;
	
	public Onibus() {
		
	}
	
	public Onibus(String empresa, String periodoCirculacao, String placa, int renavam) {
		super(placa, renavam);
		this.empresa = empresa;
		this.periodoCirculacao = periodoCirculacao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getPeriodoCirculacao() {
		return periodoCirculacao;
	}

	public void setPeriodoCirculacao(String periodoCirculacao) {
		this.periodoCirculacao = periodoCirculacao;
	}
	
}
