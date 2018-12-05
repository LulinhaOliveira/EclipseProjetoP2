package Dados;

import Negocio.Entidades.Veiculo;

public class VeiculosRepositorio {
    private Veiculo [] veiculo = new Veiculo[100];
   
	

    public Veiculo[] getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo[] veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
	public  void Inserir(Veiculo veiculo , int indice) {
    	this.veiculo[indice] = veiculo;
	}
    public void Remover(int indice) {
    	this.veiculo[indice] = null;
    }
    
	public void  Atualizar(Veiculo veiculo ,int indice) {	
    	this.veiculo[indice] = veiculo;
    }
    public Veiculo Procurar(int indice) {
        return  veiculo[indice];      
    }


}