package unitins.repository;


import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import unitins.model.Telefone;

@ApplicationScoped
public class TelefoneRepository implements PanacheRepository<Telefone> {
    public List<Telefone> findByNumero(String numero) {
        return find("UPPER(numero) LIKE UPPER(?1)", "%" + numero + "%").list();
    }
}
