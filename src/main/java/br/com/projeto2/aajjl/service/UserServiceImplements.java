package br.com.projeto2.aajjl.service;


import br.com.projeto2.aajjl.dto.request.UserRequestDTO;
import br.com.projeto2.aajjl.dto.response.UserResponseDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceImplements implements UserService {
    @Override
    public UserResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<UserResponseDTO> listAll() {
        return List.of();
    }

    @Override
    public UserResponseDTO register(UserRequestDTO newUser) {
        return null;
    }

    @Override
    public UserResponseDTO update(UserRequestDTO updateUser) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return "";
    }
}
