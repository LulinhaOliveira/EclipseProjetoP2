package p2;

public class Cliente {
	private String cpf;
	private String nome;
	private String login;
	private String senha;
	private String status = "Ativo";
	
	//o cliente poderá ver a lista de veivuclos disponiveis na locadora
	public void lista_de_veiculos() {
		
	}
	
	//alugar um veiculo
	public void aluguel_veiculos() {
		
	}
	
	//cancelar o aluguel
	public void cancelar_aluguel() {
		
	}
	
	//consultar multas se existirem
	public void consultar_multas() {
		
	}
	
	
	//metodos 'get' e 'set' para o funcionario poder alterar os seguintes dados do cliente
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
	
}
