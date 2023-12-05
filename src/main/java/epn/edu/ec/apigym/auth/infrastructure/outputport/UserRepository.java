package epn.edu.ec.apigym.auth.infrastructure.outputport;

import java.util.Optional;

import epn.edu.ec.apigym.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username); 
}
