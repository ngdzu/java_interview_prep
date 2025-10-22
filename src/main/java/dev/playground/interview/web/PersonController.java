package dev.playground.interview.web;

import dev.playground.interview.domain.Person;
import dev.playground.interview.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public List<Person> list() {
        return service.list();
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person p) {
        Person saved = service.create(p.getName());
        return ResponseEntity.created(URI.create("/api/persons/" + saved.getId())).body(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean deleted = service.delete(id);
        if (deleted)
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }
}
