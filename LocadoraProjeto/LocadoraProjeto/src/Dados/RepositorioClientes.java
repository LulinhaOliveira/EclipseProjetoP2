package Dados;
import java.util.ArrayList;

import Negocio.Clientes;

public class RepositorioClientes {
	private ArrayList<Clientes> listaClientes = new ArrayList<>();
	
	public void inserirCliente(Clientes cliente) {
		listaClientes.add(cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		listaClientes.remove(cliente);
	}
	
	public void buscarCliente(Cliente cliente) {
		return listaClientes.get(listaVeiculos.indexOf(cliente));
	}
	
	public void atualizarCliente(String nome, Cliente cliente) {
		listaClientes.add(listaVeiculos.indexOf(cliente.getNome(), cliente));
	}
}
