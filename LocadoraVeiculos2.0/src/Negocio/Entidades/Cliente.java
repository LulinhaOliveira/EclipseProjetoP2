package Negocio.Entidades;

import Utilitarios.Pessoa;

public class Cliente extends Pessoa{
	private String status = "Ativo";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}