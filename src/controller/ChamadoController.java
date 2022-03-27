package controller;

import java.util.List;
import dao.ChamadoDao;
import models.Chamado;

public class ChamadoController {
	
	public void registrarChamado(Chamado chamado) {
		
		ChamadoDao.getInstance().registrarChamado(chamado);
		
	}
	
	public List<Chamado> listar(){
		return ChamadoDao.getInstance().listar();
		
	}
	
}
