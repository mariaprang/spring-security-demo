package springsecuritydemo.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import springsecuritydemo.demo.model.User;
import springsecuritydemo.demo.repository.UserRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public void removeUser(User user){
        userRepository.delete(user);
    }

    public User loadUserByUsername(String username) {
        return userRepository.findUserByEmail(username);
    }

    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

}
