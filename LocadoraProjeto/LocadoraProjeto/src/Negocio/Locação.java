package Negocio;

public class Locacao {
	private Funcionario funcionario;
	private Clientes cliente;
	private Data data;
	private ItensLocados itensLocados;
	private float valorTotal;
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Clientes getCliente() {
		return cliente;
	}
	
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	
	public ItensLocados getItensLocados() {
		return itensLocados;
	}
	
	public void setItensLocados(ItensLocados itensLocados) {
		this.itensLocados = itensLocados;
	}
	
	public float getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
}
