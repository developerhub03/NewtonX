package com.newtonx.assessment.app;


public interface PersonService {

	Iterable<PersonDetails> listAllPersonDetails();

	PersonDetails getPersonDetailsById(Integer id);

	PersonDetails savePersonDetails(PersonDetails person);

	void deletePersonDetails(Integer id);

}
