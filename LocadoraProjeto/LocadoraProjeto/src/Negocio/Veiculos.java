package Negocio;

public class Veiculos {
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int km_rodados;
	private int ano;

	//metodos de 'get' e 'set' caso o funcionario precise alterar um desses dados. OBS: Modelo ,Marca ,Placa não altera
	
	Veiculos(String placa , String marca , String modelo , String cor ){
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.km_rodados = 0;
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public int getKilometragem() {
		return km_rodados;
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



	public String getModelo() {
		return modelo;
	}


}
