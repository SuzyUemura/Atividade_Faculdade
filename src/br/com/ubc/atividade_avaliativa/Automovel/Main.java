package br.com.ubc.atividade_avaliativa.Automovel;

public class Main {
	public static void main(String[] args) {
		
		Onibus o1 = new Onibus("Prefeitura", "Manhã", "GTH-098", 123456789);
		
		System.out.println("== CADASTRO DE VEÍCULOS ==");
		
		//Cadastro atual
		System.out.print("Empresa: " + o1.getEmpresa() + "\n" +
						 "Periodo de circulação: " + o1.getPeriodoCirculacao() + "\n" +
						 "Placa: " + o1.placa+ "\n" +
						 "RENAVAM: " + o1.getRenavam() + "\n");

	System.out.println("======== ALTERADO ========");
		// Alterações
		
		o1.alterarPlaca("ABC-5789");
		o1.setEmpresa("Suzano");
		o1.setPeriodoCirculacao("Tarde");
		o1.setRenavam(5677);
		
		System.out.print("Empresa: " + o1.getEmpresa() + "\n" +
				 "Periodo de circulação: " + o1.getPeriodoCirculacao() + "\n" +
				 "Placa: " + o1.placa+ "\n" +
				 "RENAVAM: " + o1.getRenavam() + "\n");
		
		System.out.println("== CADASTRO DE VEÍCULOS ==");
		
		Caminhao c1 = new Caminhao ("Invict", "João", "YHJ-980", 65743209);
		
		System.out.print("Modelo: " + c1.getModelo() + "\n" +
				 "Motorista: " + c1.getMotorista() + "\n" +
				 "Placa: " + c1.placa+ "\n" +
				 "RENAVAM: " + c1.getRenavam() + "\n");
		
		System.out.println("======== ALTERADO ========");
		// Alterações
		
		c1.alterarMotorista("Jorge");
		c1.alterarPlaca("LMN-098");
		c1.setModelo("Camp");
		c1.setRenavam(123);
		
		System.out.print("Modelo: " + c1.getModelo() + "\n" +
				 "Motorista: " + c1.getMotorista() + "\n" +
				 "Placa: " + c1.placa+ "\n" +
				 "RENAVAM: " + c1.getRenavam() + "\n");
	}

}
