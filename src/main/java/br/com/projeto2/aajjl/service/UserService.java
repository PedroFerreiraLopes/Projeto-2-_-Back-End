package br.com.projeto2.aajjl.service;


import br.com.projeto2.aajjl.dto.request.UserRequestDTO;
import br.com.projeto2.aajjl.dto.response.UserResponseDTO;

import java.util.List;

public interface UserService  {

    UserResponseDTO findById(Long id);
    //Depois tem que fazer um findByCPF

    List<UserResponseDTO> listAll();

    UserResponseDTO register(UserRequestDTO newUser);

    UserResponseDTO update(UserRequestDTO updateUser);

    String delete(Long id);

}
