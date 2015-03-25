package hello.service;

import hello.entity.Person;
import hello.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by in-sumida on 2015/03/24.
 */
@Service
public class PersonService{
    @Autowired
    PersonRepository personRepos;

    @org.springframework.transaction.annotation.Transactional
    public Person findPerson(Integer id) {
        return personRepos.findOne(id);
    }
}
