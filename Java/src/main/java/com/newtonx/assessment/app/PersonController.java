package com.newtonx.assessment.app;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
		Iterable<PersonDetails> listOfPersons = null;
		listOfPersons = personService.listAllPersonDetails();
		if (listOfPersons != null) {
			throw new WebApplicationException(Response.Status.NO_CONTENT);
		}
		return listOfPersons;
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public PersonDetails getPersonDetailsById(@PathParam("id") Integer id) {
		PersonDetails person = personService.getPersonDetailsById(id);
		if (person == null) {
			throw new NotFoundException();
		}
		return person;
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deletePersonDetails(@PathParam("id") Integer id) {
		try {
			personService.deletePersonDetails(id);
		} catch (Exception e) {
			throw new WebApplicationException(Response.Status.NOT_MODIFIED);
		}
		return "Succesfully Deleted User:" + id;
	}

	@POST
	@Path("/saveperson")
	@Produces(MediaType.APPLICATION_JSON)
	public PersonDetails savePersonDetails(PersonDetails person) {
		PersonDetails personDetail;
		try {
			personDetail = personService.savePersonDetails(person);
		} catch (Exception e) {
			throw new WebApplicationException(Response.Status.NOT_ACCEPTABLE);
		}
		return personDetail;
	}

}
