package springsecuritydemo.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springsecuritydemo.demo.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public User findUserByEmail(String email);

}
