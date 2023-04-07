package br.com.aps.olookinhomeu.model.PecaDeRoupa.Factories;

import br.com.aps.olookinhomeu.model.PecaDeRoupa.Calcado;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupa;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupaInferior;

public class FabricaPecaDeRoupaInferior implements Factory {
	
	
	public PecaDeRoupa createPecaDeRoupa(String nome, String tipo, long id) {
        return new PecaDeRoupaInferior (nome, tipo, id);
    }
}