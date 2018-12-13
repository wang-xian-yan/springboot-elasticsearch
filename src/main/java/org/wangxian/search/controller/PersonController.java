package org.wangxian.search.controller;

import org.springframework.web.bind.annotation.*;
import org.wangxian.search.pojo.Person;
import org.wangxian.search.repository.PersonRepository;

import java.util.List;

/**
 * @author xian
 * @date 12/13/2018
 */
@RestController
public class PersonController {
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping("/persons")
    public Person save(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping("/search")
    public List<Person> search(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "address", required = false) String address) {
        return personRepository.findByNameLikeOrAddressLike(name, address);

    }
}
