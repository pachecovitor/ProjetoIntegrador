package dao;

import java.util.ArrayList;
import java.util.List;

import models.Chamado;


public class ChamadoDao {
	
	private static ChamadoDao instance;
	private List<Chamado> listaChamados = new ArrayList<>();
	
	public static ChamadoDao getInstance() {
		if(instance == null) {
			instance = new ChamadoDao();
		}
		return instance;
	}
	
	public void registrarChamado(Chamado chamado) {
		listaChamados.add(chamado);
	}

	public List<Chamado> listar(){
		return listaChamados;
		
	}
}
