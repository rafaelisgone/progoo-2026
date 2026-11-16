package api_bd.api_bd.service;

import api_bd.api_bd.model.Produto;
import api_bd.api_bd.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.config.RepositoryNameSpaceHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    // vamos criar o objeto da Injeção de dependência
    private ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }
    // consulta os produtos no BD
    public List<Produto> listar(){
        return produtoRepository.findAll(); // select * from produtos
    }
    // consulta um produto com id no BD
    public Optional<Produto> buscar(Long id){
        return produtoRepository.findById(id);
    }

    @Transactional
    public Produto criar(Produto produto) {
        return produtoRepository.save(produto); // insert into produtos ...
    }

    // Remove produto do Bd
    @Transactional
    public boolean remover(Long id) {
        Optional<Produto> prod = buscar(id);
        if (prod.isPresent()) {
            produtoRepository.deleteById(id);
            return true; // removeu com sucesso
        }
        return false; // não existe
    }

    // Atualização
    @Transactional
     public Produto atualizar(Long id, Produto novo) {
        Optional <Produto> prod = buscar(id);
        if (prod.isPresent()) {
            novo.setId(id);
            // Novo tem id, então o save atualiza
            produtoRepository.save(novo);
            return novo;
        }
        return null;
     }

}