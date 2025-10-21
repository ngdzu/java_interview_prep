package dev.playground.interview;

import dev.playground.interview.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonControllerIntegrationTest {
    @LocalServerPort
    int port;

    TestRestTemplate rest = new TestRestTemplate();

    @Test
    void createAndList() {
        String base = "http://localhost:" + port + "/api/persons";
        Person p = new Person("Alice");
        ResponseEntity<Person> resp = rest.postForEntity(base, new HttpEntity<>(p), Person.class);
        assertThat(resp.getStatusCode().is2xxSuccessful()).isTrue();
        Person created = resp.getBody();
        assertThat(created).isNotNull();
        assertThat(created.getId()).isNotNull();

        Person[] list = rest.getForObject(base, Person[].class);
        assertThat(list).extracting(Person::getName).contains("Alice");
    }
}
