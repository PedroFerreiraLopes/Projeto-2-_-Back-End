package br.com.projeto2.aajjl.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "User")
@NoArgsConstructor
@Getter
@Setter
public class User {

    //atributos do sistema
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    //Atributo para User Ativo ou Inativo
    private Boolean ativo;

    //Profissoes
    @Enumerated(EnumType.STRING)
    private Profissao profissao;

    //atributos da pessoa
    private String nome;
    private String cpf;
    private String documento_profisional;
    private String email;
    private String senha;

    //Construtor completo pois o liso nao precisa pois o Lombook ja tem o @NoArgsConstructor
    public User(Profissao profissao, String nome, String cpf,
                String email, String senha,
                String documento_profisional) {

        this.profissao = profissao;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.documento_profisional = documento_profisional;
    }

    //Lombok resolve get set e no arguments builder
}
