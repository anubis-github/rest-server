package app;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import rs.RestEndpoint;

/**
 * @author anubis
 * @since 19/02/16
 */
@Component
public class RestConfig extends ResourceConfig {
    public RestConfig() {
        register(RestEndpoint.class);
    }
}

