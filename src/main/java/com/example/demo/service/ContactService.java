package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Contact;

public interface ContactService {
	
	public List<Contact> getAllContacts();
	public Contact getContactById(String id);

}
