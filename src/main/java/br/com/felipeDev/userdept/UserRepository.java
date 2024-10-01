package br.com.felipeDev.userdept;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.felipeDev.userdept.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
