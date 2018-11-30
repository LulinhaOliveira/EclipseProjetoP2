package Negocio;

public class ControleClientes {
	RepositorioClientes clientes;
	Clientes clienteAux;
	
	public int validarCPF(Clientes cliente) {
		int i, j, digito2 = 0;
	    if(cpf.length() != 11)
	        return 0;
	    else if(cpf == "00000000000") || (cpf == "11111111111") || (cpf == "22222222222") ||
	            (cpf == "33333333333") || (cpf == "44444444444") || (cpf == "55555555555") ||
	            (cpf == "66666666666") || (cpf == "77777777777") || (cpf == "88888888888") ||
	            (cpf == "99999999999"))
	        return 07;
	    else {
	        for(i = 0, j = 11; i < cpf.length() - 1; i++, j--){
	            digito2 += (cpf[i]-48) * j;
	            digito2 *= 11;
	        }
	    if(digito2 < 2){
	        digito2 = 0;

	    }else {
	        digito2 = 11 - digito2;
	    }
	    return 1;
	    }

	}
	
	public void cadastroCliente(Clientes cliente) {
		
	}
}
