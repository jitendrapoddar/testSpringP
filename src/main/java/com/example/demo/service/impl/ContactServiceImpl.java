package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contact;
import com.example.demo.repo.CrudService;
import com.example.demo.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	CrudService crudService;

	@Override
	public List<Contact> getAllContacts() {
		return crudService.getAllContacts();
	}

	@Override
	public Contact getContactById(String id) {
		return crudService.getContactById(id);
	}

}
