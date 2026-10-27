package api_bd.api_bd.model;

import jakarta.persistence.*;

@Entity // avisa que isto é uma entidade do bd
@Table(name="produtos")
public class Produto {
    @Id // avisa que será uma pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // gera id automaticamente
    private Long id;

    @Column(nullable = false) // nullable = false avisa que nao pode ficar vazio
    private String nome;

    @Column(nullable = false)
    private double preco;

    @Column(length = 500) // a desc vai ate 500 caracteres
    private String descricao;
}
