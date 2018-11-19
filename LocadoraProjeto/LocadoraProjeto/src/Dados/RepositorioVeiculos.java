package Dados;
import java.util.ArrayList;

import Negocio.Veiculos;

public class RepositorioVeiculos {
	private ArrayList <Veiculos> listaVeiculos = new ArrayList<>();

	public ArrayList <Veiculos> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(ArrayList<Veiculos> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}


    public void Inserir(Veiculos veiculo) {
    	listaVeiculos.add(veiculo);
    }
    public void Remover(Veiculos veiculo) {
    	listaVeiculos.remove(veiculo);
    }
    @SuppressWarnings("unlikely-arg-type")
	public void Atualizar(Veiculos veiculo) {	
    	listaVeiculos.add(listaVeiculos.indexOf(veiculo.getPlaca()),veiculo);
    }
    public Veiculos Proucurar(Veiculos veiculo) {
    	return listaVeiculos.get(listaVeiculos.indexOf(veiculo));
    }

}

