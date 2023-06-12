package com.klu.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
@RequestMapping("/train")
public class Restfull {
    
	private static int TrainNumber;
	private static String TrainName;
	
	@GetMapping("/fill/{number}/{name}")
	public void fill(@PathVariable("number") int num,@PathVariable("name") String na)
	{
		TrainNumber = num;
		TrainName = na;
	}
	
	@GetMapping("/getrequest/TrainNumber")
	public int Getrequest() 
	{
		return TrainNumber;
	}
	
	@GetMapping("/getrequest/TrainName")
	public String Getrequest1() 
	{
		return TrainName;
	}
		
}
	
