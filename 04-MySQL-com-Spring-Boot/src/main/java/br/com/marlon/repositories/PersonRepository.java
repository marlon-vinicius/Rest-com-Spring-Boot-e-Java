package br.com.marlon.repositories;

import br.com.marlon.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
    
}
