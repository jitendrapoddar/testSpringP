package com.example.demo.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Contact;

public class ContactMapper implements RowMapper<Contact> {

	@Override
	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contact contact = Contact.builder().Id(rs.getString("contactId"))
				.firstName(rs.getString("firstName")).lastName(rs.getString("lastName"))
				.phone(rs.getString("phone")).build();
				
		return contact;
	}

}
