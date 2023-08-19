package unitins.resource;

import java.util.List;

import unitins.model.Paiero;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/paieros")
public class PaieroResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Paiero> todosPaieros() {
        return Paiero.listAll();
    }
}
