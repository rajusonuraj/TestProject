package com.raj.rest.restfulwebservices.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@GetMapping(path="/user")
	public  String helloWorld()
	{
		return "Hello-World";
	}
	
	@GetMapping(path="/hello-world")
	public HelloWorldUser helloWorldUser()
	{
		return new HelloWorldUser("Hello-World");
	}

}
