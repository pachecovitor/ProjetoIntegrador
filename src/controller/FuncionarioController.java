package controller;

import java.util.List;
import dao.FuncionarioDao;
import models.Funcionario;


public class FuncionarioController {
	
	public void salvar(Funcionario funcionario) throws Exception {
		if (funcionario.getNome() == null || funcionario.getNome().length()<3) {
			throw new Exception("Nome inválido");
		}
		
		FuncionarioDao.getInstance().salvar(funcionario);
	}

	public void atualizar(Funcionario funcionario) throws Exception {
		if (funcionario.getNome() == null || funcionario.getNome().length()<3) {
			throw new Exception("Nome inválido");
		}
		
		FuncionarioDao.getInstance().atualizar(funcionario);
		
	}
	
	public void excluir(int matriculaFuncionario) throws Exception {
		
		if(matriculaFuncionario == 0) {
			throw new Exception("Nenhuma matricula selecionada");
		}
		
		FuncionarioDao.getInstance().excluir(matriculaFuncionario);
	}
	
	public List<Funcionario> listar(){
		return FuncionarioDao.getInstance().listar();
	}
	
}
