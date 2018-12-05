package Negocio;

import Dados.ClientesRepositorio;
import Negocio.Entidades.Cliente;

public class ClienteControle {
	public class ControleClientes {
		ClientesRepositorio clientes;
		Cliente cliente;
		
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
		            //digito2 += (cpf[i] - 48) * j;
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
		
		public void cadastroCliente(Cliente cliente) {
			if(cliente == null) {
				System.out.println("Cliente não existe");
			} else if(validarCPF(cliente.getCpf()) == false){
				System.out.println("CPF inválido");
			} else {
				clientes.inserirCliente(cliente);
			}
		}
		
		public void removerCliente(Cliente cliente) {
			if(cliente == null) {
				System.out.println("Cliente não existe");
			} else if(validarCPF(cliente.getCpf()) == false) {
				System.out.println("CPF inválido");
			} else {
				clientes.removerCliente(cliente);
			}
		}
		
		public void buscarCliente(Cliente cliente) {
			if(cliente == null) {
				System.out.println("Cliente não existe");
			} else if(validarCPF(cliente.getCpf()) == false) {
				System.out.println("CPF inválido");
			} else {
				clientes.buscarCliente(cliente);
			}
		}
		
		public void atualizarCliente(Cliente cliente) {
			if(cliente == null) {
				System.out.println("Cliente não existe");
			} else if(validarCPF(cliente.getCpf()) == false) {
				System.out.println("CPF inválido");
			} else {
				clientes.atualizarCliente(cliente);
			}
		}
	}
}