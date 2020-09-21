package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Contact;

public interface CrudService {
	public List<Contact> getAllContacts();
	public Contact getContactById(String id);

}
