package unitins;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import unitins.service.PessoaService;

@QuarkusTest
public class PessoaResourceTest {
    @Inject
    PessoaService pessoaService;

    @Test
    public void testFindByAll() {
        given()
                .when().get("/pessoas")
                .then()
                .statusCode(200);
    }
}
