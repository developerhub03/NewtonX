# Sample application

This is a super simple JAX-RS RESTEasy Spring Boot application just to exercise RESTEasy Spring Boot starter.<br>

## Starting the application

You can start the application as you for any other regular Spring Boot application. For example:

1. From the command line, under the sample application project, run `mvn spring-boot:run`
1. From your favorite IDE, run class `com.newtonx.assessment.app.Application`

## Testing it

Send a **POST** request message, containing the payload below, to [http://localhost:8089/sample-app/person/saveperson].

```
   {
	"firstName":"Ram",
	"lastName":"Krishna"
}
```

You should receive a response message with a payload similar to this as result:

``` json
    {
	"firstName":"Ram",
	"lastName":"Krishna",
	"createdTime": 1535568375982
}
```
Both Request and Response will be in Json Format
The response message is supposed to be firstname and lastname, plus a timestamp of the moment the response was created on the server side. The response message will be in JSON format.
