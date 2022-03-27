import controller.ChamadoController;
import controller.FuncionarioController;
import controller.VeiculoController;
import models.Chamado;
import models.Funcionario;
import models.Veiculo;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Vitor Pacheco");
		funcionario1.setCpf("12345678911");
		funcionario1.setCategoriaCnh("B");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Ricardo Silva");
		funcionario2.setCpf("98765432111");
		funcionario2.setCategoriaCnh("A");
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setModelo("Gol");
		veiculo1.setDisponibilidade("Disponível");
		veiculo1.setKmLitro(14.2);
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setModelo("Uno");
		veiculo2.setDisponibilidade("Indisponível");
		veiculo2.setKmLitro(13.8);
		
		Chamado chamado1 = new Chamado();
		chamado1.setDistanciaPercorrida(120.0);
		chamado1.setDestino("Capoeiras");
		chamado1.setFuncionario(funcionario1);
		chamado1.setVeiculo(veiculo2);
		
		FuncionarioController controller1 = new FuncionarioController();
		try {
			controller1.salvar(funcionario1);
			controller1.salvar(funcionario2);
		} catch(Exception erro) {
			System.out.println(erro.getMessage());
			}
	
		VeiculoController controller2 = new VeiculoController();
			controller2.salvar(veiculo1);
			controller2.salvar(veiculo2);

		ChamadoController controller3 = new ChamadoController();
			controller3.registrarChamado(chamado1);
		
		for(Funcionario f: controller1.listar()) {
			System.out.println("Funcionario: " +  f.toString());
		}
		
		
		for (Veiculo v: controller2.listar()) {
			System.out.println("Veículo: " + v.toString());
		}
		
		for (Chamado c: controller3.listar()) {
		System.out.println("Chamado: " + c.toString());
		
		}
	}
	
}
