package unitins.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import unitins.model.Paiero;

@ApplicationScoped
public class PaieroRepository implements PanacheRepository<Paiero>{

    public List<Paiero> findByNome(String nome) {
        return find("UPPER(nome) LIKE UPPER(?1) ", "%"+nome.toUpperCase()+"%").list();
    }
}
