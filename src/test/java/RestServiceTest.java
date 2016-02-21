import app.RestServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

/**
 * @author anubis
 * @since 20/02/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(RestServiceApplication.class)
@WebIntegrationTest(randomPort = true)
public class RestServiceTest {

        @Value("${local.server.port}")
        private int port;

        private RestTemplate restTemplate = new TestRestTemplate();

        @Test
        public void testRestServer() {
            ResponseEntity<String> entity = this.restTemplate
                    .getForEntity("http://localhost:" + this.port + "/rest-service", String.class);
            assertEquals(HttpStatus.OK, entity.getStatusCode());
        }
}
