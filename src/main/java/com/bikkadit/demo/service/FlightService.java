package com.bikkadit.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bikkadit.demo.response.Flight;
import com.bikkadit.demo.response.Flights;

@Service
public class FlightService {


	public void getflightData() {

		RestTemplate rt = new RestTemplate();
		String url = "http://mu.mulesoft-training.com/essentials/united/flights";

		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class);

		String body = forEntity.getBody();
		System.out.println(body);
	}

	public List<Flight> getAllData() {
		RestTemplate rt=new RestTemplate();
		 String url="http://mu.mulesoft-training.com/essentials/united/flights";
		 
		 ResponseEntity<Flights> forEntity = rt.getForEntity(url, Flights.class);
		 Flights body = forEntity.getBody();
		 
		 List<Flight> flights = body.getFlights();
		 
		 for(Flight f: flights) {
			 System.out.println(f);
		 }
		 
	

		return flights;
	}

}
