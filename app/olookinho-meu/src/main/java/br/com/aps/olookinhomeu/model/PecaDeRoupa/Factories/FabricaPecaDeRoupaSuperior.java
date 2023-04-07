package br.com.aps.olookinhomeu.model.PecaDeRoupa.Factories;

import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupa;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupaInferior;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupaSuperior;

public class FabricaPecaDeRoupaSuperior implements Factory {
	
	public PecaDeRoupa createPecaDeRoupa(String nome, String tipo, long id) {
        return new PecaDeRoupaSuperior (nome, tipo, id);
    }
}