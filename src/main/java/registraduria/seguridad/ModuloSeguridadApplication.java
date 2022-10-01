package registraduria.seguridad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ModuloSeguridadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuloSeguridadApplication.class, args);
    }

}