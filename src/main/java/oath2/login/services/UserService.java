package oath2.login.services;

import oath2.login.domain.User;
import oath2.login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveOrUpdateUser(String id, String name, String email) {
        User user = userRepository.findByGithubId(id);
        if (user == null) {
            user = new User();
            user.setGithubId(id);
        }
        user.setName(name);
        user.setEmail(email);
        return userRepository.save(user);
    }
}