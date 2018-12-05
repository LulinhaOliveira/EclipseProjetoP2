package Dados;

import Negocio.Entidades.Cliente;

public class ClientesRepositorio {
	
private Cliente[] cliente;
	
	public void inserirCliente(Cliente cliente) {
		for(int i = 0; i < this.cliente.length; i++) {
			if(this.cliente[i] == null) {
				this.cliente[i] = cliente;
			} else {
				System.out.println("Sem espaço para cadastro");
			}
		}
	}
	
	public void removerCliente(Cliente cliente) {
		for(int i = 0; i < this.cliente.length; i++) {
			if(this.cliente[i].getCpf() == cliente.getCpf()) {
				this.cliente[i] = null;
			}
		}
	}
	
	public void buscarCliente(Cliente cliente) {
		for(int i = 0; i < this.cliente.length; i++) {
			if(this.cliente[i].getCpf() == cliente.getCpf()) {
				System.out.println(this.cliente[i].getNome());
				System.out.println(this.cliente[i].getCpf());
				System.out.println(this.cliente[i].getStatus());
			}
		}
	}
	
	public void atualizarCliente(Cliente cliente) {
		for(int i = 0; i < this.cliente.length; i++) {
			if(this.cliente[i].getCpf() == cliente.getCpf()) {
				this.cliente[i] = cliente;
			}
		}
	}
}
