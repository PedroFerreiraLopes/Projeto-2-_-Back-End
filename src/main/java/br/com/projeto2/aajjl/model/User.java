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

    //Getters and Setters sao desnecessarios com o Lombok mas eu vo deixar por enquanto pra ficar mais facil de ler o codigo e se precisar fazer um get ou set diferenciado.
    //atributos identificadores de profissao ja que estamos utilizando uma entidade unica.
    private Boolean medico;
    private Boolean enfermeiro;
    private Boolean enfermeiro_chefe;
    private Boolean assistente_social;
    private Boolean paciente;

    //atributos da pessoa
    private String name;
    private String cpf;
    private Integer idade;
    private String documento_profisional;

    //Construtor completo pois o liso nao precisa pois o Lombook ja tem o @NoArgsConstructor
    @Builder
    public User(Boolean medico, Boolean enfermeiro,
                Boolean enfermeior_chefe, Boolean assistente_social,
                Boolean paciente, String name, String cpf) {

        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.enfermeiro_chefe = enfermeior_chefe;
        this.assistente_social = assistente_social;
        this.paciente = paciente;
        this.name = name;
        this.cpf = cpf;
    }

    //Retirnado Getters and Setters pq o Lombok tava mostrando errinho
}
