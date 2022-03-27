package dao;

import java.util.ArrayList;
import java.util.List;

import models.Veiculo;

public class VeiculoDao {

	private static VeiculoDao instance;
	private List<Veiculo> listaVeiculos = new ArrayList<>();
	
	public static VeiculoDao getInstance(){
		
		if(instance == null) {
			instance = new VeiculoDao();
		}
		return instance;
	}
	
	
	public void salvar(Veiculo veiculo) {
		listaVeiculos.add(veiculo);
	}
	
	public void atualizar(Veiculo veiculo) {
		listaVeiculos.set(veiculo.getCodigo(), veiculo);
	}
	
	public void excluir(int codigoVeiculo) {
		listaVeiculos.remove(codigoVeiculo);
	}
	
	public List<Veiculo> listar(){
		return listaVeiculos;
		
	}
	
}
