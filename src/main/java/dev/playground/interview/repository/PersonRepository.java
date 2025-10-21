package dev.playground.interview.repository;

import dev.playground.interview.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
