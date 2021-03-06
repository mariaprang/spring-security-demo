package springsecuritydemo.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import springsecuritydemo.demo.model.User;
import springsecuritydemo.demo.repository.UserRepository;
import springsecuritydemo.demo.services.UserService;

import javax.annotation.PostConstruct;

@Configuration
public class InitialData {


    private final UserService userRepository;
    private final PasswordEncoder passwordEncoder;


    @Autowired
    public InitialData(UserService userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void init() {

        User user = new User("test@gmail.com", passwordEncoder.encode("test"));

        try {
            userRepository.save(user);
        } catch (Exception ex) {
        }

    }

}
