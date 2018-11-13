package Negocio;

import Dados.RepositorioVeiculos;

public class ControleVeiculos {
    
	RepositorioVeiculos veiculo;
	Veiculos veiculoAux;
	
	public static int ValidarPlaca(String placa) {
		if(placa.length() != 8) {
			return 0;
		}
		for(int i = 0 ; i < 8 ; i++ ) {
			if(i < 3) {
				if(placa.charAt(i) != 'A'&& placa.charAt(i) != 'B' && placa.charAt(i) != 'C' && placa.charAt(i) != 'D' && placa.charAt(i) != 'E' && placa.charAt(i) != 'F' && placa.charAt(i) != 'G' && placa.charAt(i) != 'H' && placa.charAt(i) != 'I' && placa.charAt(i) != 'J' && placa.charAt(i) != 'K' && placa.charAt(i) != 'L' && placa.charAt(i) != 'M' && placa.charAt(i) != 'N' && placa.charAt(i) != 'O' && placa.charAt(i) != 'P' && placa.charAt(i) != 'Q' && placa.charAt(i) != 'R'&& placa.charAt(i) != 'S' && placa.charAt(i) != 'T' && placa.charAt(i) != 'U' && placa.charAt(i) != 'V' && placa.charAt(i) != 'X' && placa.charAt(i) != 'W' && placa.charAt(i) != 'Y' && placa.charAt(i) != 'Z' ) {
					return 0;
				}
			
			}else if(i == 3) {
				if(placa.charAt(i) != '-') {
					return 0;
				}			
			}else if(i < 8) {
				if(placa.charAt(i) != 0 && placa.charAt(i) != 1 && placa.charAt(i) != 2 && placa.charAt(i) != 3 && placa.charAt(i) != 4 || placa.charAt(i) != 5 && placa.charAt(i) != 6 && placa.charAt(i) != 7 && placa.charAt(i) != 8 && placa.charAt(i) != 9 ) {
				    return 0 ;
				}
			}
		}
		return 1;
	}
	public static int ValidarAtualização() {
		return 1;
	}
	
	
	public void Cadastro(Veiculos veiculo) {
		if(veiculo == null) {
			return;
		}else if(ValidarPlaca(veiculo.getPlaca()) == 0) {
			return;
		}
	    this.veiculo.Inserir(veiculo);
	}
    
	@SuppressWarnings("unlikely-arg-type")
	public void Remoção(String placa) {
    	if(placa == null) {
    		return;
    	}
       
       veiculoAux = this.veiculo.getListaVeiculos().get(this.veiculo.getListaVeiculos().indexOf(placa)) ;
       this.veiculo.Remover(veiculoAux);
    }
    
	public void Atualização(Veiculos veiculo) {
    	if(veiculo == null) {
    		return;
    	}
        this.veiculo.Atualizar(veiculo);
    }
    
	@SuppressWarnings("unlikely-arg-type")
    public void Proucura(String placa) {
    	if(placa == null) {
    		return;
    	}
    	veiculoAux = this.veiculo.getListaVeiculos().get(this.veiculo.getListaVeiculos().indexOf(placa)) ;
        this.veiculo.Proucurar(veiculoAux);
    }
}
