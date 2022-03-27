package models;

import java.time.LocalDate;

public class Funcionario {
	
	private int matricula;
	private String cpf;
	private String nome;
	private LocalDate dataNascimento;
	private String categoriaCnh;
	
	public Funcionario() {
		
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCategoriaCnh() {
		return categoriaCnh;
	}
	public void setCategoriaCnh(String categoriaCnh) {
		this.categoriaCnh = categoriaCnh;
	}
	
	public String toString() {
		return nome + " - " + cpf + " - " + categoriaCnh;
		
	}
	
}

