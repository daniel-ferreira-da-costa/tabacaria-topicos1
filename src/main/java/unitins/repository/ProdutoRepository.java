package unitins.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import unitins.model.Produto;


public class ProdutoRepository implements PanacheRepository<Produto>{
    public List<Produto> findByNome(String nome) {
        return find("UPPER(nome) LIKE UPPER(?1) ", "%"+nome.toUpperCase()+"%").list();
    }
}
