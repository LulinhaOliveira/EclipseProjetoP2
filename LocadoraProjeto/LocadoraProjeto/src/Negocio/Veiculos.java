package Negocio;

public class Veiculos implements Comparable<Veiculos>{
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int km_rodados;
    private int ano;
    private double pre�o;
	//metodos de 'get' e 'set' caso o funcionario precise alterar um desses dados. OBS: Modelo ,Marca ,Placa n�o altera
	
	Veiculos(String placa , String marca , String modelo , String cor , int ano , double pre�o ){
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.km_rodados = 0;
		this.marca = marca;
	    this.ano = ano;
	    this.pre�o = pre�o;
	    
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
	public int getAno() {
		return ano;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}	
	@Override
	public int compareTo(Veiculos o) {
		if(this.ano < o.getAno()) {
			return -1;
		}else if(this.ano > o.getAno()) {
			return 1;
		}
		return 0 ; 
	}
	



}
