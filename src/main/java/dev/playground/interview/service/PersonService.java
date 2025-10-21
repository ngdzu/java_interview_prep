package dev.playground.interview.service;

import dev.playground.interview.domain.Person;
import dev.playground.interview.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository repo;

    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    public Person create(String name) {
        return repo.save(new Person(name));
    }

    public List<Person> list() {
        return repo.findAll();
    }
}
