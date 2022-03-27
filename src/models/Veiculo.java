package models;

public class Veiculo {

	private int codigo;
	private String placa;
	private String modelo;
	private String disponibilidade;
	private double kmLitro;
	
	public Veiculo() {
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public double getKmLitro() {
		return kmLitro;
	}
	public void setKmLitro(double kmLitro) {
		this.kmLitro = kmLitro;
	}
	
	public String toString() {
		return modelo + " - " + disponibilidade + " - " + kmLitro;
		
	}
	
}
