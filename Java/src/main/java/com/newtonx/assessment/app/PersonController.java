package com.newtonx.assessment.app;

import java.util.ArrayList;
import java.util.List;

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

	@Path("/getalldetails")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Iterable<PersonDetails> getAllPersonDetails() {
		Iterable<PersonDetails> listOfPersons = null;
		List<PersonDetails> target = new ArrayList<>();
		listOfPersons = personService.listAllPersonDetails();
		listOfPersons.forEach(target::add);
		if (target.size() == 0) {
			throw new WebApplicationException(Response.Status.NO_CONTENT,"There are no person details yet.. please add first and then retrieve them...");
		}
		return listOfPersons;
	}

	@GET
	@Path("/getdetails/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public PersonDetails getPersonDetailsById(@PathParam("id") Integer id) {
		PersonDetails person = personService.getPersonDetailsById(id);
		if (person == null) {
			throw new WebApplicationException(Response.Status.NOT_FOUND,"Person details for the id: " + id +" not found...");
		}
		return person;
	}

	@DELETE
	@Path("/deletedetails/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deletePersonDetails(@PathParam("id") Integer id) {
		try {
			personService.deletePersonDetails(id);
		} catch (Exception e) {
			throw new WebApplicationException(Response.Status.NOT_FOUND,"Person details for the id: " + id +" not found...");
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
			throw new WebApplicationException(Response.Status.NOT_ACCEPTABLE,"Give all the mandatory fields in the Person details");
		}
		return personDetail;
	}

}
