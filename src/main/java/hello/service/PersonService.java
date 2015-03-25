package hello.service;

import hello.entity.Person;
import hello.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by in-sumida on 2015/03/24.
 */
@Service
public class PersonService{
    @Autowired
    PersonRepository personRepos;

    @Transactional
    public Person findPerson(Integer id) {
        return personRepos.findOne(id);
    }

    @Transactional
    public List<Person> findAllPeople() {
        return personRepos.findAll(new Sort(Sort.Direction.ASC, "id"));
    }
}
