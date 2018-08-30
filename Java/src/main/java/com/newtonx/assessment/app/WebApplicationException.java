package com.newtonx.assessment.app;

import javax.ws.rs.core.Response;

public class WebApplicationException extends RuntimeException {

	private static final long serialVersionUID = 7758037011460404750L;

	public WebApplicationException() {
	}

	public WebApplicationException(Response response) {
	}

	public WebApplicationException(int status) {
	}

	public WebApplicationException(Response.Status status) {
	}

	public WebApplicationException(Throwable cause) {
	}

	public WebApplicationException(Throwable cause, Response response) {
	}

	public WebApplicationException(Throwable cause, int status) {
	}

	public WebApplicationException(Throwable cause, Response.Status status) {
	}

	public WebApplicationException(Response.Status status, String msg) {
		super(msg);
	}

}
