package br.com.projeto2.aajjl.repository;

import br.com.projeto2.aajjl.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Aparentemente a anotação @Repository nao é mais necessaria, mas vo deixar pq eu aprendi assim e tbm pra deixar tudo padronizado no Maeven
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
