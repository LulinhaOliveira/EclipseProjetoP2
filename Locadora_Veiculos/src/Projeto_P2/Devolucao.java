package Projeto_P2;

public class Devolucao {
	private Data data;
	private Cliente cliente;
	private ItensLocados itemLocado;
	private Funcionario funcionario;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ItensLocados getItemLocado() {
		return itemLocado;
	}

	public void setItemLocado(ItensLocados itemLocado) {
		this.itemLocado = itemLocado;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
