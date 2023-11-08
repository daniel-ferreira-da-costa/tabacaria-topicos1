package unitins;
import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import unitins.service.EnderecoService;
@QuarkusTest
public class EnderecoResourceTest {
    @Inject
    EnderecoService enderecoService;

    @Test
    public void testFindByAll() {
        given()
                .when().get("/enderecos")
                .then()
                .statusCode(200);
    }
    
}
