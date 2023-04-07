package br.com.aps.olookinhomeu.model.Look;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupa;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.Calcado;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupaInferior;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupaSuperior;

@Component
public class CadastroLook {

    @Autowired
    private IRepositorioLook repositorioLook;
    private int counter;
    
    public void RepositorioUsuario() {
		this.counter = 0;
	}


    public void addLook(String nome, List<PecaDeRoupa> pecasDeRoupa) {
    	//vai precisar ser obrigatorio colocar pecasderoupa

        if (pecasDeRoupa.isEmpty()) { // checar se tem como tratar isso direto no front // tem, mas acho melhor ter
                                      // outro check // se for pra ter outro check, talvez seja uma excecao, mas dps a
                                      // gt checa
            throw new RuntimeException("Nao ha pecas de roupa para criar um look");
        } else {
               	
        	
            Look look = new Look(nome, counter, 
            					 null, 
            					 null, 
            					 null);
            this.counter = this.counter++;
        	
        	
            for (PecaDeRoupa peca : pecasDeRoupa) {
                String tipo = peca.getTipo();

                switch (tipo) {
                    case "Calcado":
                    	Calcado calcado = new Calcado(peca.getNome(), peca.getTipo(), peca.getId());
                        look.setCalcado(calcado);
                        break;
                    case "PecaDeRoupaSuperior":
                    	PecaDeRoupaSuperior superior = new PecaDeRoupaSuperior(peca.getNome(), peca.getTipo(), peca.getId());
                        look.setPecaDeRoupaSuperior(superior);
                        break;
                    case "Inferior":
                    	PecaDeRoupaInferior inferior = new PecaDeRoupaInferior(peca.getNome(), peca.getTipo(), peca.getId());
                      	look.setPecaDeRoupaInferior(inferior);
                        break;
                    default:
                        break; // talvez excecao
                }

            }
            look.setNome(nome);

            repositorioLook.addLook(look);

        }

    }

    public void editarLook(Long id, String nome, List<PecaDeRoupa> pecasDeRoupa) {
        Look selectedLook = repositorioLook.consultarLookPeloId(id);
        if (selectedLook == null) {
            throw new RuntimeException("Nao ha look com esse ID");
        } else {
            if(!pecasDeRoupa.isEmpty()){
                for (PecaDeRoupa peca : pecasDeRoupa) {
                    String tipo = peca.getTipo();
    
                    switch (tipo) {
                        case "Calcado":
                           	Calcado calcado = new Calcado(peca.getNome(), peca.getTipo(), peca.getId());
                            selectedLook.setCalcado(calcado);
                            break;
                        case "Superior":
                        	PecaDeRoupaSuperior pecaDeRoupaSuperior = new PecaDeRoupaSuperior(peca.getNome(), peca.getTipo(), peca.getId());
                            selectedLook.setPecaDeRoupaSuperior(pecaDeRoupaSuperior);
                            break;
                        case "Inferior":
                        	PecaDeRoupaInferior pecaDeRoupaInferior = new PecaDeRoupaInferior(peca.getNome(), peca.getTipo(), peca.getId());
                            selectedLook.setPecaDeRoupaInferior(pecaDeRoupaInferior);
                            break;
                        default:
                            break; // talvez excecao
                    }
                }
            }

            selectedLook.setNome(nome);
            
            repositorioLook.editarLook(selectedLook);
        }
    }

    public void deletarLook(Long id) {
        repositorioLook.deletarLook(id);
    }

    public List<Look> consultarLooks() {
        return repositorioLook.consultarLooks();
    }

    public Look consultarLookPeloId(Long id) {
        return repositorioLook.consultarLookPeloId(id);
    }

}