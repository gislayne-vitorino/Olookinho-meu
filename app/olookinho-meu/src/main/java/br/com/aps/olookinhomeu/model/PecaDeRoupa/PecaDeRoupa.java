package br.com.aps.olookinhomeu.model.PecaDeRoupa;

//import jakarta.persistence.*;

//@Entity
public class PecaDeRoupa {

	private String nome;
	private String tipo;
	private long id;
	
	public PecaDeRoupa(String nome, String tipo, long id) {
		this.nome = nome;
		this.tipo = tipo;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
}
