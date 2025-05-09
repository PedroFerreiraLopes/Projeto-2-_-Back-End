package br.com.projeto2.aajjl.dto.request;

import lombok.Getter;

@Getter
public class UserRequestDTO {
    //Esse DTO de request existe pois para registrar um novo User nao precisa ter acesso aos metodos
    //oou Services que o Respose vai precisar ter, no caso, sao duas classes com tipos de dados difernetes
    //sendo trazidos ou levados

    private Boolean medico;
    private Boolean enfermeiro;
    private Boolean enfermeior_chefe;
    private Boolean assistente_social;
    private Boolean paciente;


    private String name;
    private String cpf;
    private Integer idade;
    private String documento_profisional;

}
