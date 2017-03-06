package com.cts.controller;
import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cts.dao.Person;
import com.google.gson.Gson;
	


	@RestController
	
	public class CountryController {

		
		
		@RequestMapping(value="/person", method = RequestMethod.GET)
		public String getAllDetails(){
			
			
			Person person = new Person();
			Person person1 = new Person();
			List<Person> personList = new ArrayList<Person>();
			
			person.setFirstName("Souvik");
			person.setLastName("Sen");
			//person.setRoles(Arrays.asList("Application Lead", "Sr. Developer"));
			
			person1.setFirstName("Raju");
			person1.setLastName("Bibar");
			//person1.setRoles(Arrays.asList("Team Member", "Developer"));
			
			personList.add(person);
			personList.add(person1);
			
			Gson gson = new Gson();
			String json = gson.toJson(personList);
			return json;
			
		}

		
	}

