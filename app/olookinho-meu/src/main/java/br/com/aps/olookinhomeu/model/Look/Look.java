package br.com.aps.olookinhomeu.model.Look;

import br.com.aps.olookinhomeu.model.PecaDeRoupa.Calcado;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupa;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupaInferior;
import br.com.aps.olookinhomeu.model.PecaDeRoupa.PecaDeRoupaSuperior;
//import jakarta.persistence.*;

//@Entity
public class Look {
	
	
	
	private String nome;
	private long id;
	private PecaDeRoupaSuperior pecaDeRoupaSuperior;
	private PecaDeRoupaInferior pecaDeRoupaInferior;
	private Calcado calcado;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PecaDeRoupaSuperior getPecaDeRoupaSuperior() {
		return pecaDeRoupaSuperior;
	}

	public void setPecaDeRoupaSuperior(PecaDeRoupaSuperior pecaDeRoupaSuperior) {
		this.pecaDeRoupaSuperior = pecaDeRoupaSuperior;
	}

	public PecaDeRoupaInferior getPecaDeRoupaInferior() {
		return pecaDeRoupaInferior;
	}

	public void setPecaDeRoupaInferior(PecaDeRoupaInferior pecaDeRoupaInferior) {
		this.pecaDeRoupaInferior = pecaDeRoupaInferior;
	}

	public Calcado getCalcado() {
		return calcado;
	}

	public void setCalcado(Calcado calcado) {
		this.calcado = calcado;
	}

	public Look(String nome, long id, PecaDeRoupaSuperior pecaDeRoupaSuperior, PecaDeRoupaInferior pecaDeRoupaInferior,
			Calcado calcado) {
		super();
		this.nome = nome;
		this.id = id;
		this.pecaDeRoupaSuperior = pecaDeRoupaSuperior;
		this.pecaDeRoupaInferior = pecaDeRoupaInferior;
		this.calcado = calcado;
	}

	public LookMemento salvarMemento() {
        return new LookMemento(this.nome, this.pecaDeRoupaSuperior, this.pecaDeRoupaInferior, this.calcado);
    }

    public void restaurarMemento(LookMemento memento) {
        this.nome = memento.getNome();
        this.pecaDeRoupaSuperior = memento.getPecaDeRoupaSuperior();
        this.pecaDeRoupaInferior = memento.getPecaDeRoupaInferior();
        this.calcado = memento.getCalcado();
    }

}
