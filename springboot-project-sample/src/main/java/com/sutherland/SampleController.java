package com.sutherland;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
	@GetMapping
	public String wecome()
	{
		return "welcome to kashmir";
	}
	@GetMapping("/getreq")
	public String anotherGet()
	{
		return "another get request";
	}
	
	@PostMapping
	public String postRequest()
	{
		return "i am post request";
	}
	
	@PutMapping
	public String putRequest()
	{
		return "i am put request";
	}
	
	@DeleteMapping
	public String deleteRequest()
	{
		return "i am delete request";
	}

}
