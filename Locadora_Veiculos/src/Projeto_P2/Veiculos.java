package Projeto_P2;

public class Veiculos {
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int km_rodados;

	//metodos de 'get' e 'set' caso o funcionario precise alterar um desses dados. OBS: Modelo e Marca não altera
	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public int getKilometragem() {
		return km_rodados;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setKilometragem(int km_rodados) {
		this.km_rodados = km_rodados;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
