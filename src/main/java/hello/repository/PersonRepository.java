package hello.repository;

import hello.entity.Person;
import org.springframework.data.mirage.repository.MirageRepository;

/**
 * Created by in-sumida on 2015/03/24.
 */
public interface PersonRepository extends MirageRepository<Person, Integer>{
}
