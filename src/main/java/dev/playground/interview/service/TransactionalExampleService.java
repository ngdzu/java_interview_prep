package dev.playground.interview.service;

import dev.playground.interview.domain.Person;
import dev.playground.interview.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionalExampleService {
    private final PersonRepository repo;

    public TransactionalExampleService(PersonRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public void createAndThrow(String name) {
        repo.save(new Person(name));
        // simulate error that causes rollback
        if (true)
            throw new RuntimeException("fail");
    }
}
