package com.newtonx.assessment.app;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * REST endpoint class
 *
 */
@Path("/person")
@Component
public class PersonController {

	@Autowired
	private PersonServiceImpl personService;

	@Path("/all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Iterable<PersonDetails> getAllPersonDetails() {
		Iterable<PersonDetails> listOfPersons = personService.listAllPersonDetails();
		return listOfPersons;
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public PersonDetails getPersonDetailsById(@PathParam("id") Integer id) {
		return personService.getPersonDetailsById(id);
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deletePersonDetails(@PathParam("id") Integer id) {
		try {
			personService.deletePersonDetails(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Succesfully Deleted User:" + id;
	}

	@POST
	@Path("/saveperson")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public PersonDetails savePersonDetails(PersonDetails person) {
		return personService.savePersonDetails(person);
	}

}
