package dao;

import java.util.ArrayList;
import java.util.List;

import models.Funcionario;

public class FuncionarioDao {

	private static FuncionarioDao instance;
	private List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	public static FuncionarioDao getInstance() {
		if(instance == null) {
			instance = new FuncionarioDao();
		}
		return instance;
	}
	
	public void salvar(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
	}

	public void atualizar(Funcionario funcionario) {	
		listaFuncionarios.set(funcionario.getMatricula(), funcionario);
	}
	
	public void excluir(int matriculaFuncionario) {
		listaFuncionarios.remove(matriculaFuncionario);
	}
	
	public List<Funcionario> listar(){
		return listaFuncionarios;
	}
	
}
