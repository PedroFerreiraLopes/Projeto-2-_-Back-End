package br.com.projeto2.aajjl.service;


import br.com.projeto2.aajjl.L_dto.request.L_UserRequestDTO;
import br.com.projeto2.aajjl.L_dto.response.L_UserResponseDTO;

import java.util.List;

public interface L_UserService {

    L_UserResponseDTO findById(Long id);
    //Depois tem que fazer um findByCPF

    List<L_UserResponseDTO> listAll();

    L_UserResponseDTO register(L_UserRequestDTO newUser);

    L_UserResponseDTO update(L_UserRequestDTO updateUser, Long id);

    String delete(Long id);

}
