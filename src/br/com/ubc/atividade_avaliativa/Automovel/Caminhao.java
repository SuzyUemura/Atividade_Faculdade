package br.com.ubc.atividade_avaliativa.Automovel;

public class Caminhao extends Automovel{
	
	private String modelo;
	private String motorista;
	
	public Caminhao() {
		
	}

	public Caminhao(String modelo, String motorista, String placa, int renavam) {
		super(placa, renavam);
		this.modelo = modelo;
		this.motorista = motorista;
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	
	public String alterarMotorista(String motorista) {
		setMotorista(motorista);
		return getMotorista();
	}
	
	public String alterarPlaca (String placa) {
		return super.placa = placa;
	}
}
