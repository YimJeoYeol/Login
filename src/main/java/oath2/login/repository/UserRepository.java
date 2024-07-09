package oath2.login.repository;


import oath2.login.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByGithubId(String githubId);
}