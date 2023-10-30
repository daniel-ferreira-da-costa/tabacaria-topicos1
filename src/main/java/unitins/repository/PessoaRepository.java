package unitins.repository;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.NoResultException;
import unitins.model.Pessoa;

@ApplicationScoped 
public class PessoaRepository implements PanacheRepository<Pessoa>{
    public List<Pessoa> findByNome(String nome) {
        return find("UPPER(nome) LIKE UPPER(?1) ", "%"+nome.toUpperCase()+"%").list();
    }

    public Pessoa findById(Long id) {
        try {
            return find("id = ?1", id).singleResult();
        } catch (NoResultException p) {
            p.printStackTrace();
            return null;
        }
    }

    public Pessoa findByEmail(String email) {
        try {
            return find("email = ?1", email).singleResult();
        } catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }
        
    }


}
