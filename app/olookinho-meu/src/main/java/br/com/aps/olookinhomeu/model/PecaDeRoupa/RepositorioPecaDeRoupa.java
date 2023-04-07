package br.com.aps.olookinhomeu.model.PecaDeRoupa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.aps.olookinhomeu.model.Usuario.Usuario;

@Component
public class RepositorioPecaDeRoupa implements IRepositorioPecaDeRoupa {

  @Autowired
    private List<PecaDeRoupa> pecaDeRoupa;

	@Override
	public void addPecaDeRoupa(PecaDeRoupa pecaDeRoupa) {
        this.pecaDeRoupa.add(pecaDeRoupa);
		
	}

	@Override
	public List<PecaDeRoupa> consultarPecasDeRoupa() {
		return this.pecaDeRoupa;
	}

	@Override
    public PecaDeRoupa consultarPecaDeRoupaPeloID(Long id) {
		
		PecaDeRoupa pecaDeRoupaEncontrado = null;
    	boolean encontrado = false;
       for(int i =0; i<= this.pecaDeRoupa.size(); i++ ) {
    	   if (this.pecaDeRoupa.get(i).getId() == id) {
    		   pecaDeRoupaEncontrado = this.pecaDeRoupa.get(i);
    		   encontrado =true;
    	   }
       }
        if(encontrado == true) {
            return pecaDeRoupaEncontrado;
        } else {
            throw new RuntimeException("Nao existe peca de roupa  que corresponda ao id: "  + id);
        }
	}
		
		
	
	@Override
	public void deletarPecaDeRoupa(Long id) {
        for(int i =0; i< this.pecaDeRoupa.size(); i++ ) {
      	   if (this.pecaDeRoupa.get(i).getId() == id) {
      		   this.pecaDeRoupa.remove(i);
      	   }
         }		
	}
	
	
}