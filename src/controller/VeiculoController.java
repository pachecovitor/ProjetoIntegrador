package controller;


import java.util.List;

import dao.VeiculoDao;
import models.Veiculo;

public class VeiculoController {

	public void salvar(Veiculo veiculo)  {
		
		VeiculoDao.getInstance().salvar(veiculo);
	}
	
	public void atualizar(Veiculo veiculo) {
		
		VeiculoDao.getInstance().atualizar(veiculo);
	}
	
	public void excluir(int codigoVeiculo) {
		
		VeiculoDao.getInstance().excluir(codigoVeiculo);
	}
	
	public List<Veiculo> listar(){
		return VeiculoDao.getInstance().listar();
		
	}
}
