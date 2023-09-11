package unitins.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import unitins.model.Narguile;

public class NarguileRepository implements PanacheRepository<Narguile>{

    public List<Narguile> findByNome(String nome) {
        return find("UPPER(nome) LIKE UPPER(?1) ", "%"+nome.toUpperCase()+"%").list();
    }
}
