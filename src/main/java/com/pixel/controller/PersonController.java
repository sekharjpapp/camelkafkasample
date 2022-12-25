package com.pixel.controller;

import com.pixel.model.Person;
import com.pixel.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/people")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    @PostMapping("")
    public ResponseEntity<?> doProcessPersonObj(@RequestBody Person person) {
        return ResponseEntity.ok(personRepository.save(person));
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updatePerson(@PathVariable int id, @RequestBody Person person) {
        var personOp = personRepository.findById(id);
        return personOp.map(p-> {
            p.setName(person.getName());
            p.setAge(person.getAge());
            return ResponseEntity.ok(personRepository.save(p));
        }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/revisions")
    public List<String> revisions() {
        return personRepository.findRevisions(1).stream().map(Object::toString).collect(Collectors.toList());
    }
    @GetMapping("/rev")
    public String revisionsSample() {
        return "Hehehe";
    }
}
