package registraduria.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import registraduria.seguridad.Modelos.Rol;


public interface RepositorioRol extends MongoRepository<Rol,String> {
}
