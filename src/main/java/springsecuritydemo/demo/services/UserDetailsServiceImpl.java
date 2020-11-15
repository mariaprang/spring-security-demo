package springsecuritydemo.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import springsecuritydemo.demo.repository.UserRepository;

public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userRepository.findUserByEmail(s);
    }

//    private final MemberRepository userRepository;
//    private static final Logger log = LoggerFactory.getLogger(MemberDetailsService.class);
//    @Autowired
//    public MemberDetailsService(MemberRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Member member = userRepository.loadUserByUsername(username);
//        if(member!=null) {
//            log.info(member.toString());
//            return member;
//        }else{
//            log.info("USER NOT FOUND!!!");
//            throw new UsernameNotFoundException( "User with the username '" + username + "' not found.");
//        }
//    }
}
