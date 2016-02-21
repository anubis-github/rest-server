package rs;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author anubis
 * @since 20/02/16
 */
@Component
@Path("/rest-service")
public class RestEndpoint {

    @GET
    public String message() {
        return "Hello";
    }
}
