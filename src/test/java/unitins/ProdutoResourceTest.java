package unitins;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import jakarta.inject.Inject;
import unitins.dto.ProdutoDTO;
import unitins.service.ProdutoService;
@QuarkusTest
public class ProdutoResourceTest {

    @Inject
    ProdutoService produtoService;

    @Test
    public void testFindByAll() {
        given()
                .when().get("/produtos")
                .then()
                .statusCode(200);
    }


     @Test
    public void testInsert() {

        ProdutoDTO dto = new ProdutoDTO("paiero", 70, 10.90, 16.70, "paiero de morango");

        given()
            .contentType(ContentType.JSON)
            .body(dto)
            .when().post("/produtos")
            .then()
            .statusCode(201)
            .body(
                "id", notNullValue(),
                "nome", is("paiero"),
                "qtdNoEstoque", is(70),
                "valor", is(10.90),
                "preco", is(16.70),
                "descricao", is("paiero de morango")
            );
    }
}
