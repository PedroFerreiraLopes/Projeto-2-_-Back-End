package br.com.projeto2.aajjl.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "User")
@Getter
@Setter
public class User {

    //atributos do sistema
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //atributos identificadores
    private Boolean medico;
    private Boolean enfermeiro;
    private Boolean enfermeior_chefe;
    private Boolean assistente_social;
    private Boolean paciente;

    //atributos da pessoa
    private String name;
    private String cpf;
    private Integer idade;
    private String documento_profisional;


    //Contrutor
    public User(Long id, Boolean medico, Boolean enfermeiro,
                Boolean enfermeior_chefe, Boolean assistente_social,
                Boolean paciente, String name, String cpf) {

        this.id = id;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.enfermeior_chefe = enfermeior_chefe;
        this.assistente_social = assistente_social;
        this.paciente = paciente;
        this.name = name;
        this.cpf = cpf;
    }


    //Getters and Setters sao desnecessarios com o Lombok mas eu vo deixar por enquanto pra ficar mais facil de ler o codigo e se precisar fazer um get ou set diferenciado.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getMedico() {
        return medico;
    }

    public void setMedico(Boolean medico) {
        this.medico = medico;
    }

    public Boolean getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Boolean enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Boolean getEnfermeior_chefe() {
        return enfermeior_chefe;
    }

    public void setEnfermeior_chefe(Boolean enfermeior_chefe) {
        this.enfermeior_chefe = enfermeior_chefe;
    }

    public Boolean getAssistente_social() {
        return assistente_social;
    }

    public void setAssistente_social(Boolean assistente_social) {
        this.assistente_social = assistente_social;
    }

    public Boolean getPaciente() {
        return paciente;
    }

    public void setPaciente(Boolean paciente) {
        this.paciente = paciente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getDocumento_profisional() {
        return documento_profisional;
    }

    public void setDocumento_profisional(String documento_profisional) {
        this.documento_profisional = documento_profisional;
    }


}
