package unitins.resource;

import java.util.List;

import unitins.model.Paiero;

import unitins.repository.PaieroRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/paieros")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PaieroResource {

    @Inject
    PaieroRepository repository;

    @POST
    @Transactional
    public Paiero insert(Paiero paiero) {
        Paiero novoPaiero = new Paiero();
        novoPaiero.setNome(paiero.getNome());
        novoPaiero.setMarca(paiero.getMarca());
        novoPaiero.setSabor(paiero.getSabor());

        repository.persist(novoPaiero);

        return novoPaiero;
    }

    @GET
    public List<Paiero> findAll() {
        return repository.listAll();
    }

    @GET
    @Path("/{id}")
    public Paiero findById(@PathParam("id") Long id) {
        return repository.findById(id);
    }

    @GET
    @Path("/search/nome/{nome}")
    public List<Paiero> findByNome(@PathParam("nome") String nome) {
        return repository.findByNome(nome);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, Paiero paiero) {
        Paiero p = repository.findById(id);

        p.setNome(paiero.getNome());
        p.setMarca(paiero.getMarca());
        p.setSabor(paiero.getSabor());

        return Response.ok(p).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response dalete(@PathParam("id") Long id) {
        repository.deleteById(id);
        return Response.noContent().build();
    }
}
