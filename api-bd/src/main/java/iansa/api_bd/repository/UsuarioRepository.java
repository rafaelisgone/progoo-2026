package iansa.api_bd.repository;

import iansa.api_bd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Interface herda de outra interface, chamada JpaRepository
// UsuarioRepository vai possuir os métodos de CRUD da entidade Usuario
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aqui insere, remove, consulta, atualiza da classe Usuario
}
