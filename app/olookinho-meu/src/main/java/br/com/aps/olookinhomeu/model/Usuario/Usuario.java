package  br.com.aps.olookinhomeu.model.Usuario;

//import jakarta.persistence.*;

//@Entity
public class Usuario {

	private String nome;
	private String email;
	private long id;
	
	public Usuario(String nome, String email, long id) {
		this.nome = nome;
		this.email = email;
		this.id = id;
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
