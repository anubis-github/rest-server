package app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * @author anubis
 * @since 19/02/16
 */
@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(RestServiceApplication.class).run(args);
    }
}
