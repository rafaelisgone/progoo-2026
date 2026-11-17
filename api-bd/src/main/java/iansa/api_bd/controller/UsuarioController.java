package iansa.api_bd.controller;

import iansa.api_bd.model.Usuario;
import iansa.api_bd.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    // Injeção de dependência
    private UsuarioService usuarioService;

    // CERTO
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Listar usuários
    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }

    // Buscar usuário por ID
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable Long id) {
        return usuarioService.buscarUsuario(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build()); // 404
    }

    // Inserir usuário no BD
    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        Usuario novo = usuarioService.criarUsuario(usuario);
        URI uri = URI.create("/usuarios/" + novo.getId());
        return ResponseEntity.created(uri).body(novo); // retorna 201
    }

    // Remover um usuário
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerUsuario(@PathVariable Long id) {
        if (usuarioService.removerUsuario(id)) {
            return ResponseEntity.noContent().build(); // 200
        }
        // Não removeu
        return ResponseEntity.notFound().build(); // 404
    }
}
