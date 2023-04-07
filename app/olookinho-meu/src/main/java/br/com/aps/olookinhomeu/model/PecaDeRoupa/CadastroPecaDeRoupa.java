package br.com.aps.olookinhomeu.model.PecaDeRoupa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import br.com.aps.olookinhomeu.model.PecaDeRoupa.Factories.*;

@Component
public class CadastroPecaDeRoupa{

    Factory fabricaSuperior = new FabricaPecaDeRoupaSuperior();
    Factory fabricaInferior = new FabricaPecaDeRoupaInferior();
    Factory fabricaCalcado = new FabricaCalcado();
    
    private int counter;
    
    public void RepositorioUsuario() {
		this.counter = 0;
	}


    @Autowired
    private IRepositorioPecaDeRoupa repositorioPecaDeRoupa;

    public void addPecaDeRoupa(String nome, String tipo) throws IOException{
    	long id = this.counter;
    	this.counter = this.counter++;
        PecaDeRoupa pecaDeRoupa = gerarPecadeRoupa(nome,tipo , id);
        
        //pecaDeRoupa.setNome(nome);
        //pecaDeRoupa.setImagem(imagemData);

        repositorioPecaDeRoupa.addPecaDeRoupa(pecaDeRoupa);
    }

    public void deletarPecaDeRoupa(Long id){
        repositorioPecaDeRoupa.deletarPecaDeRoupa(id);
    }

    public List<PecaDeRoupa> consultarPecasDeRoupa(){
        return repositorioPecaDeRoupa.consultarPecasDeRoupa();
    }

    public PecaDeRoupa consultarPecaDeRoupaPeloId(Long id) {
    return repositorioPecaDeRoupa.consultarPecaDeRoupaPeloID(id);
    }

    private PecaDeRoupa gerarPecadeRoupa(String nome, String tipo, long id) {
        PecaDeRoupa pecaDeRoupa = null;

        switch (tipo) {
            case "Superior":
                pecaDeRoupa = fabricaSuperior.createPecaDeRoupa(nome, tipo, id);
                 break;
            case "Inferior":
                pecaDeRoupa = fabricaInferior.createPecaDeRoupa(nome, tipo, id);
                 break;
            case "Calcado":
                pecaDeRoupa = fabricaCalcado.createPecaDeRoupa(nome, tipo, id);
                 break;
            default:
                break;
        }
        return pecaDeRoupa;
    }
}