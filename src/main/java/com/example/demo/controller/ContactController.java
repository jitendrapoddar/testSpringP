package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class ContactController {
	@Autowired
	ContactService contactService;
	
	@GetMapping(value = "/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contact> getAllContact() {
		List<Contact> contacts = null;
		try {
			contacts = contactService.getAllContacts();
		} catch (Exception e) {
			log.info("Exception occurs while fetching : {}", e);
		}
		
		return contacts;
	}
	
	@GetMapping(value = "/contacts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact getContactById(@PathVariable String id) {
		Contact contact = null;
		try {
			contact = contactService.getContactById(id);
		} catch (Exception e) {
			log.info("Exception occurs while fetching : {}", e);
		}
		
		return contact;
	}

}
