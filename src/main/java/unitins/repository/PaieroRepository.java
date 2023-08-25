package unitins.repository;

import java.util.List;

import unitins.model.Paiero;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaieroRepository implements PanacheRepository<Paiero>{

    public List<Paiero> findByNome(String nome) {
        return find("UPPER(nome) LIKE UPPER(?1) ", "%"+nome+"%").list();
    }
}
