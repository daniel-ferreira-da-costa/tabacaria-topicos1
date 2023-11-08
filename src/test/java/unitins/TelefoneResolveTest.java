package unitins;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import unitins.service.TelefoneService;

@QuarkusTest
public class TelefoneResolveTest {
    @Inject
    TelefoneService telefoneService;

    @Test
    public void testFindByAll() {
        given()
            .when().get("/telefones")
            .then()
            .statusCode(200);
    }
}
