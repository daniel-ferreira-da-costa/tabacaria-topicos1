package unitins.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import unitins.dto.ProdutoDTO;
import unitins.dto.ProdutoResponseDTO;
import unitins.model.Produto;
import unitins.repository.ProdutoRepository;

@ApplicationScoped
public class ProdutoServiceImpl implements ProdutoService{
    @Inject
    ProdutoRepository repository;

    @Override
    @Transactional
    public ProdutoResponseDTO insert(ProdutoDTO dto) {
        Produto novoProduto = new Produto();
            novoProduto.setNome(dto.getNome());
            novoProduto.setDescricao(dto.getDescricao());
            novoProduto.setPreco(dto.getPreco());
            novoProduto.setValor(dto.getValor());
            novoProduto.setQtdNoEstoque(dto.getQtdNoEstoque());

        repository.persist(novoProduto);

        return ProdutoResponseDTO.valueOf(novoProduto);
    }

    @Override
    @Transactional
    public ProdutoResponseDTO update(ProdutoDTO dto, Long id) {
        
        Produto Produto = repository.findById(id);
        if (Produto != null) {
            Produto.setNome(dto.getNome());
            Produto.setDescricao(dto.getDescricao());
            Produto.setPreco(dto.getPreco());
            Produto.setValor(dto.getValor());
            Produto.setQtdNoEstoque(dto.getQtdNoEstoque());
        } else 
            throw new NotFoundException();

        return ProdutoResponseDTO.valueOf(Produto);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!repository.deleteById(id)) 
            throw new NotFoundException();
    }

    @Override
    public ProdutoResponseDTO findById(Long id) {
        return ProdutoResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<ProdutoResponseDTO> findByNome(String nome) {
        return repository.findByNome(nome).stream()
            .map(e -> ProdutoResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<ProdutoResponseDTO> findByAll() {
        return repository.listAll().stream()
            .map(e -> ProdutoResponseDTO.valueOf(e)).toList();
    }
    
}
