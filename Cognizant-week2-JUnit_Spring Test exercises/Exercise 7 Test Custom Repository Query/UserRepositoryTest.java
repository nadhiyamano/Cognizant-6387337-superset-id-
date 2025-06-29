import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByName() {

        User user1 = new User();
        user1.setId(1L);
        user1.setName("Alice");

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Bob");

        User user3 = new User();
        user3.setId(3L);
        user3.setName("Alice");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        List<User> usersNamedAlice = userRepository.findByName("Alice");

        assertThat(usersNamedAlice).hasSize(2);
        assertThat(usersNamedAlice).extracting(User::getName).containsOnly("Alice");
    }
}
