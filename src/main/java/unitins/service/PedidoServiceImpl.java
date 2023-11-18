package unitins.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import unitins.dto.ItemPedidoDTO;
import unitins.dto.PedidoDTO;
import unitins.dto.PedidoResponseDTO;
import unitins.model.Produto;
import unitins.model.ItemPedido;
import unitins.model.Pedido;
import unitins.repository.ProdutoRepository;
import unitins.repository.PedidoRepository;
import unitins.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PedidoServiceImpl implements PedidoService {

    @Inject
    ProdutoRepository ProdutoRepository;

    @Inject
    UsuarioRepository usuarioRepository;

    @Inject
    PedidoRepository pedidoRepository;

    @Override
    @Transactional
    public PedidoResponseDTO insert(PedidoDTO dto, String login) {
        Pedido pedido = new Pedido();
        pedido.setDataHora(LocalDateTime.now());

        // calculo do total do pedido
        Double total = 0.0;
        for (ItemPedidoDTO itemDto : dto.itens()) {
            total += (itemDto.preco() * itemDto.quantidade());
        }
        pedido.setTotalPedido(total);

        // adicionando os itens do pedido
        pedido.setItens(new ArrayList<ItemPedido>());
        for (ItemPedidoDTO itemDto : dto.itens()) {
            ItemPedido item = new ItemPedido();
            item.setPreco(itemDto.preco());
            item.setQuantidade(itemDto.quantidade());
            item.setPedido(pedido);
            Produto Produto = ProdutoRepository.findById(itemDto.idProduto());
            item.setProduto(Produto);

            // atualizado o estoque
            Produto.setQtdNoEstoque(Produto.getQtdNoEstoque() - item.getQuantidade());

            pedido.getItens().add(item);
        }

        // buscando o usuario pelo login
        pedido.setUsuario(usuarioRepository.findByLogin(login));

        // salvando no banco
        pedidoRepository.persist(pedido);

        // atualizando o estoque
  

        return PedidoResponseDTO.valueOf(pedido);
        
    }

        @Override
    public PedidoResponseDTO findById(Long id) {
        return PedidoResponseDTO.valueOf(pedidoRepository.findById(id));
    }

    @Override
    public List<PedidoResponseDTO> findByAll() {
        return pedidoRepository.listAll().stream()
            .map(e -> PedidoResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<PedidoResponseDTO> findByAll(String login) {
        return pedidoRepository.listAll().stream()
            .map(e -> PedidoResponseDTO.valueOf(e)).toList();
    }
    
}