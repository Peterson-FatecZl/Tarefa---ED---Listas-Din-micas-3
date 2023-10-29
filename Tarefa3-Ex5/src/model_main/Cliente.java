package model_main;

public class Cliente {

	public String CPF;
	public String Nome;
	public int Idade;
	public double LimiteCredito;
	
	public Cliente() {
		super();
	}
	public Cliente(String cpf, String nome, String idade, String limiteCredito) {
		
		this.CPF = cpf;
		this.Nome = nome;
		this.Idade = Integer.parseInt(idade);
		this.LimiteCredito = Double.parseDouble(limiteCredito);
	}

	@Override
	public String toString() {
		return CPF + ";" + Nome + ";" + Idade + ";" + LimiteCredito;
	}
}
