package mk.ukim.finki.lab1_emt_213064.repository;

import mk.ukim.finki.lab1_emt_213064.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {
     Optional<MyUser> findByUsernameAndPassword(String username, String password);
     Optional<MyUser> findByUsername(String username);
}
