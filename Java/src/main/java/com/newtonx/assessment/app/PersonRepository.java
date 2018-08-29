package com.newtonx.assessment.app;

import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<PersonDetails, Integer> {

}
