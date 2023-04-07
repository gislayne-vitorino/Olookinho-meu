package br.com.aps.olookinhomeu.model.Look;

import br.com.aps.olookinhomeu.model.PecaDeRoupa.Calcado;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupa;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupaInferior;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupaSuperior;

public class LookMemento{
    private String nome;
    private PecaDeRoupaSuperior pecaDeRoupaSuperior;
    private PecaDeRoupaInferior pecaDeRoupaInferior;
    private Calcado calcado;
    
    public LookMemento(String nome, PecaDeRoupaSuperior pecaDeRoupaSuperior, 
    		PecaDeRoupaInferior pecaDeRoupaInferior, Calcado calcado){
        this.nome = nome;
        this.pecaDeRoupaSuperior = pecaDeRoupaSuperior;
        this.pecaDeRoupaInferior = pecaDeRoupaInferior;
        this.calcado = calcado;
    }
    
    public String getNome() {
        return nome;
    }
    
    public PecaDeRoupaSuperior getPecaDeRoupaSuperior() {
        return pecaDeRoupaSuperior;
    }
    
    public PecaDeRoupaInferior getPecaDeRoupaInferior() {
        return pecaDeRoupaInferior;
    }
    
    public Calcado getCalcado() {
        return calcado;
    }
}
