import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD) // resets DB state after each test
public class UserIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFullFlow_CreateAndGetUser() {

        User user = new User();
        user.setId(1L);
        user.setName("Integration Test User");

        ResponseEntity<User> postResponse = restTemplate.postForEntity("/users", user, User.class);
        assertThat(postResponse.getStatusCodeValue()).isEqualTo(200);
        assertThat(postResponse.getBody()).isNotNull();
        assertThat(postResponse.getBody().getName()).isEqualTo("Integration Test User");

        User savedUser = userRepository.findById(1L).orElse(null);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getName()).isEqualTo("Integration Test User");

        ResponseEntity<User> getResponse = restTemplate.getForEntity("/users/1", User.class);
        assertThat(getResponse.getStatusCodeValue()).isEqualTo(200);
        assertThat(getResponse.getBody()).isNotNull();
        assertThat(getResponse.getBody().getName()).isEqualTo("Integration Test User");
    }
}
