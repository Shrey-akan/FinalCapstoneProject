package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.contactentity.Contact;
import com.demo.contactrepo.ContactRepo;
import com.demo.studentity.Student;
import com.demo.studrepo.StudentRepo;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Contactcontroller {

	@Autowired
	private ContactRepo crepo;	
	
	@Autowired
	private StudentRepo srepo;
	
	//SERVICES FOR CONTACT FROM
	//INSERT THE CONNTACT DETAILS SERVICE
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertcontactrecord")
	public Contact insertcontactrecord(@RequestBody Contact c1)
	{
		return crepo.save(c1);
	}
	//FETCH THE CONTACT DETAILS SERVICE
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewcontactdetails")
	public List<Contact> viewcontactdetails(){
		return crepo.findAll();
	}
	
	//SERVICES FOR STUDENT
	//STUDENT INSERT DATA SERVICE
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertstudrecord")
	public Student insertstudrecord(@RequestBody Student s1)
	{
		return srepo.save(s1);
	}
	
	//STUDENT DETAILS  UPDATE SERVICE
		@CrossOrigin(origins="http://localhost:4200")
		@PostMapping("/updatestuudentdetails")
		public Student updatestuudentdetails(@RequestBody Student s1) {
			return srepo.save(s1);
		}
		
		//STUDENT DETAILS DELETE SERVICE
		@CrossOrigin(origins="http://localhost:4200")
		@PostMapping("/deletestudentdetails")
		public void deletestudentdetails(@RequestBody Student s1) {
			 srepo.delete(s1);
		}
		
	//STUDENT DETAILS FETCH SERVICE 
		@CrossOrigin(origins="http://localhost:4200")
		@GetMapping("viewstudentdetails")
		public List<Student> viewstudentdetails(){
			return srepo.findAll();
		}
}
