package iansa.api_bd.service;

import iansa.api_bd.model.Usuario;
import iansa.api_bd.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    // Injeção de dependência
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Consultar usuários no BD
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll(); // select * from produtos
    }

    // Consultar usuário por ID
    public Optional<Usuario> buscarUsuario(Long id) {
        return usuarioRepository.findById(id);
    }

    @Transactional
    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario); // insert into usuarios ...
    }

    // Remover usuário do BD
    @Transactional
    public boolean removerUsuario(Long id) {
        Optional<Usuario> user = buscarUsuario(id);
        if (user.isPresent()) {
            usuarioRepository.deleteById(id);
            return true; // removeu com sucesso
        }
        return false; // não existe
    }

    // Atualizar usuário
    @Transactional
    public Usuario atualizarUsuario(Long id, Usuario novo) {
        Optional <Usuario> user = buscarUsuario(id);
        if (user.isPresent()) {
            novo.setId(id);
            // Novo tem id, então o save atualiza
            usuarioRepository.save(novo);
            return novo;
        }
        return null;
    }
}
