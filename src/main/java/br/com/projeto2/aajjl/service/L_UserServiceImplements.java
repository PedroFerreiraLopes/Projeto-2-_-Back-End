package br.com.projeto2.aajjl.service;


import br.com.projeto2.aajjl.L_dto.request.L_UserRequestDTO;
import br.com.projeto2.aajjl.L_dto.response.L_UserResponseDTO;
import br.com.projeto2.aajjl.model.User;
import br.com.projeto2.aajjl.repository.UserRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class L_UserServiceImplements implements L_UserService {

    //Injetando o repositorio no service
    private UserRepository userRepository;

    //metodo findUser para nao ficar copiando e colando codigo
    //Esse "Optional" foi sugestao do Intelij mesmo
    private Optional<User> returnUser(Long id){
        return Optional.ofNullable(userRepository.findById(id).orElseThrow(() -> new RuntimeException("User nao encontrado no banco de dados")));
    }


    @Override
    public L_UserResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<L_UserResponseDTO> listAll() {
        return List.of();
    }

    @Override
    public L_UserResponseDTO register(L_UserRequestDTO newUser) {
        return null;
    }

    @Override
    public L_UserResponseDTO update(L_UserRequestDTO updateUser, Long id) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return "";
    }
}
