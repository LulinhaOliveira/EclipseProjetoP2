package Negocio;

public class ControleClientes {
	RepositorioClientes clientes;
	Clientes clienteAux;
	
	public void inserirCliente(Clientes cliente) {
		if(cliente  == null) {
			
		} else {
			this.clientes.add(cliente);
		} 
		
	}
}
