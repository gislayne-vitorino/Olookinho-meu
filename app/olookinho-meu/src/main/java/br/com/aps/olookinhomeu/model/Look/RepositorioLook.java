package br.com.aps.olookinhomeu.model.Look;

import org.springframework.stereotype.Component;

import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupa;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Component
public class RepositorioLook implements IRepositorioLook {
    
    @Autowired
    private List<Look> look;

    @Override
    public void addLook(Look look) {
    	this.look.add(look);
    }

    @Override
    public void editarLook(Look look) { // lembrar de ver bd
//        f
//    	this.lookDAO.save(look);
    }

    @Override
    public List<Look> consultarLooks() {
        return this.look;
    }

    @Override
    public Look consultarLookPeloId(Long id) {
		Look lookEncontrado = null;
    	boolean encontrado = false;
       for(int i =0; i<= this.look.size(); i++ ) {
    	   if (this.look.get(i).getId() == id) {
    		   lookEncontrado = this.look.get(i);
    		   encontrado =true;
    	   }
       }
        if(encontrado == true) {
            return lookEncontrado;
        } else {
            throw new RuntimeException("Nao existe peca de roupa  que corresponda ao id: "  + id);
        }
 
    }

    @Override
    public void deletarLook(Long id) {
    	 for(int i =0; i< this.look.size(); i++ ) {
        	   if (this.look.get(i).getId() == id) {
        		   this.look.remove(i);
        	   }
           }		

    }



}