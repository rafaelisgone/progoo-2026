package iansa.api_bd.model;

import jakarta.persistence.*;

@Entity // sinaliza que é uma entidade do banco de dados
@Table(name="usuarios") // batiza o nome da tabela
public class Usuario {
    @Id // campo id será uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerada automaticamente
    private Long id;

    //"@Column" sinaliza que será uma coluna
    //"nullable = false" indica que não pode ser vazio
    @Column(nullable = false)
    private String nome_completo;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String tipo_usuario;

    @Column(nullable = false)
    private boolean status_usuario;

    // ======== CONSTRUTOR VAZIO ========

    public Usuario() {
    }

    // ======== GETTERS E SETTERS ========

    // Id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Nome completo
    public String getNome_completo() {
        return nome_completo;
    }
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    // Cpf
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Senha
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Tipo usuário
    public String getTipo_usuario() {
        return tipo_usuario;
    }
    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    // Status usuário
    public boolean isStatus_usuario() {
        return status_usuario;
    }
    public void setStatus_usuario(boolean status_usuario) {
        this.status_usuario = status_usuario;
    }
}