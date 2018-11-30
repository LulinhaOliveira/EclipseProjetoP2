package Dados;
import java.util.ArrayList;

import Negocio.Clientes;

public class RepositorioClientes {
	private Clientes[] cliente;
	
	public void inserirCliente(Clientes cliente) {
		for(int i = 0; i < this.cliente.length; i++) {
			if(this.cliente[i] == null) {
				this.cliente[i] = cliente;
			}
		}
	}
	
	public void removerCliente(String cpf) {
		for(int i = 0; i < this.cliente.length; i++) {
			if(this.cliente[i].getCpf() == cpf) {
				this.cliente[i] = null;
			}
		}
	}
	
	public void buscarCliente(String cpf) {
		for(int i = 0; i < this.cliente.length; i++) {
			if(this.cliente[i].getCpf() == cpf) {
				System.out.println(this.cliente[i].getNome());
				System.out.println(this.cliente[i].getCpf());
				System.out.println(this.cliente[i].getStatus());
			}
		}
	}
	
	public void atualizarCliente(String cpf, Clientes cliente) {
		for(int i = 0; i < this.cliente.length; i++) {
			if(this.cliente[i].getCpf() == cpf) {
				this.cliente[i] = cliente;
			}
		}
	}
}
