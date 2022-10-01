package registraduria.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import registraduria.seguridad.Modelos.Usuario;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {
    @Query("{'correo': ?0}")
    public Usuario getUserByEmail(String correo);
}

