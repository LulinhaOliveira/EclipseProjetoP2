package Dados;


import Negocio.Veiculos;

public class RepositorioVeiculos {
    private Veiculos [] veiculo = new Veiculos[100];
   
	

    public Veiculos[] getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculos[] veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
	public  void Inserir(Veiculos veiculo , int indice) {
    	this.veiculo[indice] = veiculo;
	}
    public void Remover(int indice) {
    	this.veiculo[indice] = null;
    }
    
	public void  Atualizar(Veiculos veiculo ,int indice) {	
    	this.veiculo[indice] = veiculo;
    }
    public Veiculos Procurar(int indice) {
        return  veiculo[indice];      
    }


}

