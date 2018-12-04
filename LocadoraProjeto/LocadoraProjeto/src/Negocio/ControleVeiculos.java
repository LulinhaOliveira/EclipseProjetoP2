package Negocio;


import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import Dados.RepositorioVeiculos;

public class ControleVeiculos {
	static Calendar cal = GregorianCalendar.getInstance(); 
	RepositorioVeiculos veiculo;

	//Placa Deve Estar no Padrão
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
    //Ano Deve Ser Menor Que o Atual
    public static int ValidarAno(int ano) {
    	if(ano < cal.get(Calendar.YEAR)){
    		return 0;
    	}
    	return 1;
    }
	public static int VerificarPlacaExiste(String placa , Veiculos [] veiculo) {
		for(int i = 0 ; i < veiculo.length ; i++) {
			if(placa == veiculo[i].getPlaca()) {
				return 0;
			}
		}
		return 1;
	}
	
	
	
	
	
	public void Cadastro(Veiculos veiculo) {
		if(veiculo == null) {
			return;
		}else if(ValidarPlaca(veiculo.getPlaca()) == 0) {
			return;
		}else if(ValidarAno(veiculo.getAno()) == 0){	
		    return;	
		}else {	
			for(int i = 0; i < this.veiculo.getVeiculo().length; i++) {
				if(this.veiculo.getVeiculo()[i] == null) {
				   this.veiculo.Inserir(veiculo, i);
	               Arrays.sort(this.veiculo.getVeiculo());
				   break;
				}
			}		
		}
	}
    

	public void Remoção(String placa) {
      if(placa == null || placa == "") {
    	  return;
      }else if(ValidarPlaca(placa) == 0) {
    	  return;
      }else {
  		for(int i = 0 ; i < this.veiculo.getVeiculo().length ; i++) {
     	   if(this.veiculo.getVeiculo()[i].getPlaca() == placa) {
     		   this.veiculo.Remover(i);
               Arrays.sort(this.veiculo.getVeiculo());
     		   break;
     	   }
        }   	     	  
      }	
	}
    
	public void Atualização(Veiculos veiculo) {
		if(veiculo == null) {
			return ;
		}else if(ValidarPlaca(veiculo.getPlaca()) == 0) {
			return;
		}else if(ValidarAno(veiculo.getAno())==0){
		    return;	
		}else if(VerificarPlacaExiste(veiculo.getPlaca(),this.veiculo.getVeiculo()) == 0){
			return;
		}else {
			for(int i = 0; i < this.veiculo.getVeiculo().length; i++) {
				if(this.veiculo.getVeiculo()[i].getPlaca() == veiculo.getPlaca() ) {
				   this.veiculo.Atualizar(veiculo, i);
				   break;
				}
			}
		}
    }
    

    public Veiculos Procura(String placa) {
		if(placa == null || placa == "") {
			return null;
		}else if(ValidarPlaca(placa) == 0) {
			return null;
		}else {
	    	for(int i = 0; i < this.veiculo.getVeiculo().length; i++) {
				if(this.veiculo.getVeiculo()[i].getPlaca() == placa) {
				   return this.veiculo.Procurar(i);
				}
			}		
		}
		return null;
    }
    
    public void Imprimir(String placa) {
    	Veiculos aux;
    	aux = Procura(placa);
    	System.out.println("Placa : " + aux.getPlaca());
    	System.out.println("Ano : " + aux.getAno());
    	System.out.println("Cor : " + aux.getCor());
    	System.out.println("Marca : " + aux.getMarca());
    	System.out.println("Modelo : " + aux.getModelo());
    	System.out.println("Quilometro Rodados : " + aux.getKilometragem());
    }



}
