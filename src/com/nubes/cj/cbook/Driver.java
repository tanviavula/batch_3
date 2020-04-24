package com.nubes.cj.cbook;

import com.nubes.cj.cbook.service.ContactService;
import com.nubes.cj.cbook.service.ContactServiceImpl;
import com.nubes.cj.cbook.util.ContactUtil;
public class Driver {
	public static void main(String[] args) {
		ContactService contactService = ContactServiceImpl.getInstance();
		while(true) {
			System.out.println("------------------------- Contact Book Application-----------------------------");
			System.out.println("1.add 2.delete 3.update 4.search 5.view all 6.exit ");
			//TODO
		}
	}
}
