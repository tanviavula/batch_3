package com.nubes.cj.cbook.dao;

import java.util.ArrayList;
import java.util.List;

import com.nubes.cj.cbook.domain.Contact;
import com.nubes.cj.cbook.exceptions.ContactExistsException;
import com.nubes.cj.cbook.util.ContactUtil;

public class ContactDaoInMemoryDBImpl implements ContactDao {

	private static volatile ContactDao obj = null;

	private List<Contact> list;

	private ContactDaoInMemoryDBImpl() {
		list = new ArrayList<Contact>();
	}

	public static ContactDao getInstance() {

		synchronized (ContactDaoInMemoryDBImpl.class) {
			if (obj == null) {
				obj = new ContactDaoInMemoryDBImpl();
			}
		}
		return obj;
	}

	@Override
	public Contact addContact(Contact contact) throws ContactExistsException {
		String id = ContactUtil.generateId();
		contact.setId(id);
		list.add(contact);
		return contact;
	}

	@Override
	public Contact updateContact(Contact contact) throws ContactExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(String cid) {
		// TODO Auto-generated method stub
		return false;
	}

}
