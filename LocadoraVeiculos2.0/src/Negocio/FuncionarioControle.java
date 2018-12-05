package Negocio;

import Dados.FuncionariosRepositorio;
import Negocio.Entidades.Funcionario;

public class FuncionarioControle {
	FuncionariosRepositorio funcionarios;
	Funcionario funcionario;
	
	public boolean validarCPF(String cpf) {
		int i, j, digito2 = 0;
	    if(cpf.length() != 11)
	        return false;
	    else if((cpf == "00000000000") || (cpf == "11111111111") || (cpf == "22222222222") ||
	            (cpf == "33333333333") || (cpf == "44444444444") || (cpf == "55555555555") ||
	            (cpf == "66666666666") || (cpf == "77777777777") || (cpf == "88888888888") ||
	            (cpf == "99999999999"))
	        return false;
	    else {
	        for(i = 0, j = 11; i < cpf.length() - 1; i++, j--){
	           // digito2 += (cpf[i] - 48) * j;
	            digito2 *= 11;
	        }
	    if(digito2 < 2){
	        digito2 = 0;

	    }else {
	        digito2 = 11 - digito2;
	    }
	    return true;
	    }

	}
	
	public void cadastroFuncionario(Funcionario funcionario) {
		if(funcionario == null) {
			System.out.println("Funcionario não existe");
		} else if(validarCPF(funcionario.getCpf()) == false){
			System.out.println("CPF inválido");
		} else {
			funcionarios.inserirFuncionario(funcionario);
		}
	}
	
	public void removerFuncionario(Funcionario funcionario) {
		if(funcionario == null) {
			System.out.println("Funcionario não existe");
		} else if(validarCPF(funcionario.getCpf()) == false){
			System.out.println("CPF inválido");
		} else {
			funcionarios.inserirFuncionario(funcionario);
		}
	}
	
	public void atualizarFuncionario(Funcionario funcionario) {
		if(funcionario == null) {
			System.out.println("Funcionario não existe");
		} else if(validarCPF(funcionario.getCpf()) == false){
			System.out.println("CPF inválido");
		} else {
			funcionarios.atualizarFuncionario(funcionario);
		}
	}
	
	public void buscarFuncionario(Funcionario funcionario) {
		if(funcionario == null) {
			System.out.println("Funcionario não existe");
		} else if(validarCPF(funcionario.getCpf()) == false){
			System.out.println("CPF inválido");
		} else {
			funcionarios.buscarFuncionario(funcionario);
		}
	}
}

