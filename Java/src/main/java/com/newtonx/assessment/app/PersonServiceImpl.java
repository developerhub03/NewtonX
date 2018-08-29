package com.newtonx.assessment.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Person service implement.
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Iterable<PersonDetails> listAllPersonDetails() {
		return personRepository.findAll();
	}

	@Override
	public PersonDetails getPersonDetailsById(Integer id) {
		return personRepository.findOne(id);
	}

	@Override
	public PersonDetails savePersonDetails(PersonDetails person) {
		return personRepository.save(person);
	}

	@Override
	public void deletePersonDetails(Integer id) {
		personRepository.delete(id);

	}

}
