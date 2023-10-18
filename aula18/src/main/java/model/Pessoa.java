package model;

import java.time.LocalDate;

public class Pessoa {
	
	private int anoNascimento;
	private boolean aniversarioFeito;
	private String nome;
	private String endereco;
	
	public Pessoa(int anoNascimento, boolean aniversarioFeito, String nome, String endereco) {
		super();
		this.anoNascimento = anoNascimento;
		this.aniversarioFeito = aniversarioFeito;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public boolean isAniversarioFeito() {
		return aniversarioFeito;
	}
	public void setAniversarioFeito(boolean aniversarioFeito) {
		this.aniversarioFeito = aniversarioFeito;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int caulularIdade() {
		LocalDate current_date = LocalDate.now();
		int anoAtual = current_date.getYear();
		
		int idade = anoAtual - anoNascimento;
		
		
		if(!aniversarioFeito) {
			idade--;
		}
		
		
		return idade;
	}
	
	public static Boolean BarserBoolean(String param) {
		if(param.equalsIgnoreCase("sim")) {
			return true;
		}
		return false;
	}
	

}
