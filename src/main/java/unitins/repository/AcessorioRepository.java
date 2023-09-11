package unitins.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import unitins.model.Acessorio;

public class AcessorioRepository implements PanacheRepository<Acessorio>{
    public List<Acessorio> findByNome(String nome) {
        return find("UPPER(nome) LIKE UPPER(?1) ", "%"+nome.toUpperCase()+"%").list();
    }
}
