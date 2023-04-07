package  br.com.aps.olookinhomeu.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//repositorio cadastro aqui

@Component
public class RepositorioUsuario implements IRepositorioUsuario {

    @Autowired
    private List<Usuario> usuario;
    


    @Override
    public void adicionarUsuario(Usuario usuario) {
        this.usuario.add(usuario);
    }
    
	@Override
    public List<Usuario> consultarTodosUsuarios() {    	
    	return usuario;
    }

    @Override
    public Usuario consultarUsuarioPorId(long id) {
    	Usuario usuarioencontrado = null;
    	boolean encontrado = false;
       for(int i =0; i<= this.usuario.size(); i++ ) {
    	   if (this.usuario.get(i).getId() == id) {
    		   usuarioencontrado = this.usuario.get(i);
    		   encontrado =true;
    	   }
       }
        if(encontrado == true) {
            return usuarioencontrado;
        } else {
            throw new RuntimeException("Usuario com id " + id + " não encontrado");
        }
    }

    @Override
    public Usuario consultarUsuarioPorEmail(String email) {
    	Usuario usuarioencontrado = null;
    	boolean encontrado = false;
       for(int i =0; i<= this.usuario.size(); i++ ) {
    	   if (this.usuario.get(i).getEmail() == email) {
    		   usuarioencontrado = this.usuario.get(i);
    		   encontrado =true;
    	   }
       }
        if(encontrado == true) {
            return usuarioencontrado;
        } else {
            throw new RuntimeException("Usuario com email " + email + " não encontrado");
        }
    }

    @Override
    public void deletarUsuarioPorId(long id) {
        for(int i =0; i<= this.usuario.size(); i++ ) {
     	   if (this.usuario.get(i).getId() == id) {
     		   this.usuario.remove(i);
     	   }
        }
    }
}
