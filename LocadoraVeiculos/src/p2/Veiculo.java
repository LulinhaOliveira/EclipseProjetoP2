package p2;

//apenas o "corpo" do veiculo

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int km_rodados;
	
	//metodos de 'get' e 'set' caso o funcionario precise alterar um desses dados. OBS: Modelo e Marca n�o altera
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
}
