package Dados;
import java.util.ArrayList;

import Negocio.Locação;
public class RepositorioLocacao {
	private Locacao[] locacoes;

	public void inserirLocacao(Locacao locacao) {
		for(int i = 0; i < this.locacoes.length; i++) {
			if(this.locacoes[i] == null) {
				this.locacoes[i] = locacao;
			}
		}
	}
	
	//atualizar
}
