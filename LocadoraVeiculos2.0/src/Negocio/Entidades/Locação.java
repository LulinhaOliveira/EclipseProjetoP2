package Negocio.Entidades;

import Utilitarios.Data;

public class Loca��o {
	private String funcionarioCPF;
	private String clienteCPF;
	private Data datalocada;
	private Data datadevolu��o;
	private String [] placaveiculoslocados;
	private float valorTotal;
	

	
	public float getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}


	public String getFuncionarioCPF() {
		return funcionarioCPF;
	}

	public void setFuncionarioCPF(String funcionarioCPF) {
		this.funcionarioCPF = funcionarioCPF;
	}

	public String getClienteCPF() {
		return clienteCPF;
	}

	public void setClienteCPF(String clienteCPF) {
		this.clienteCPF = clienteCPF;
	}

	public Data getDatalocada() {
		return datalocada;
	}

	public void setDatalocada(Data datalocada) {
		this.datalocada = datalocada;
	}

	public Data getDatadevolu��o() {
		return datadevolu��o;
	}

	public void setDatadevolu��o(Data datadevolu��o) {
		this.datadevolu��o = datadevolu��o;
	}

	public String [] getPlacaveiculoslocados() {
		return placaveiculoslocados;
	}

	public void setPlacaveiculoslocados(String [] placaveiculoslocados) {
		this.placaveiculoslocados = placaveiculoslocados;
	}
	
}