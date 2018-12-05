package Dados;

import Negocio.Entidades.Funcionario;

public class FuncionariosRepositorio {
	private Funcionario[] funcionario;
	
	public void inserirFuncionario(Funcionario funcionario) {
		for(int i = 0; i < this.funcionario.length; i++) {
			if(this.funcionario[i] == null) {
				this.funcionario[i] = funcionario;
			} else {
				System.out.println("Sem espaço para cadastro");
			}
		}
	}
	
	public void removerFuncionario(Funcionario funcionario) {
		for(int i = 0; i < this.funcionario.length; i++) {
			if(this.funcionario[i].getCpf() == funcionario.getCpf()) {
				this.funcionario[i] = null;
			}
		}
	}
	
	public void buscarFuncionario(Funcionario funcionario) {
		for(int i = 0; i < this.funcionario.length; i++) {
			if(this.funcionario[i].getCpf() == funcionario.getCpf()) {
				System.out.println(this.funcionario[i].getNome());
				System.out.println(this.funcionario[i].getCpf());
				System.out.println(this.funcionario[i].getSetor()	);
			}
		}
	}
	
	public void atualizarFuncionario(Funcionario funcionario) {
		for(int i = 0; i < this.funcionario.length; i++) {
			if(this.funcionario[i].getCpf() == funcionario.getCpf()) {
				this.funcionario[i] = funcionario;
			}
		}
	}
}
