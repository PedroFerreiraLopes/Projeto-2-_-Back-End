package br.com.projeto2.aajjl.L_dto.response;

import lombok.Getter;

@Getter
public class L_UserResponseDTO {

    private Long id;

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
