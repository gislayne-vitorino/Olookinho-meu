package br.com.aps.olookinhomeu.model.PecaDeRoupa.Factories;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupa;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.Calcado;

public class FabricaCalcado implements Factory {
    
	public PecaDeRoupa createPecaDeRoupa(String nome, String tipo, long id) {
        return new Calcado(nome, tipo, id);
    }

}