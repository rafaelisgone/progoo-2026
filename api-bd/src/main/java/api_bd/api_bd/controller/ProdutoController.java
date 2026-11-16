package api_bd.api_bd.controller;

import api_bd.api_bd.model.Produto;
import api_bd.api_bd.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        return ResponseEntity.ok(produtoService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscar(@PathVariable Long id) {
        return produtoService.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build()); // 404
    }

    // Insere produto no BD
    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto produto) {
        Produto novo = produtoService.criar(produto);
        URI uri = URI.create("/produtos/" + novo.getId());
        return ResponseEntity.created(uri).body(novo); // retorna 201
    }

    // Remover um produto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id) {
        if (produtoService.remover(id)) {
            // Removeu com sucesso retorna 200
            return ResponseEntity.noContent().build();
        }
        // Não removeu
        return ResponseEntity.notFound().build(); // 404
    }

    // Atualiza produto
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        Produto atualizado = produtoService.atualizar(id, produto);
        if (atualizado != null) {
             return ResponseEntity.ok(atualizado);
        }
        return ResponseEntity.notFound().build();
    }

}