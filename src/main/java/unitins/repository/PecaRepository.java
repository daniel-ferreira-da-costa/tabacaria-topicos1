package unitins.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import unitins.model.Peca;

public class PecaRepository implements PanacheRepository<Peca>{
    public List<Peca> findByNome(String nome) {
        return find("UPPER(nome) LIKE UPPER(?1) ", "%"+nome.toUpperCase()+"%").list();
    }
}
