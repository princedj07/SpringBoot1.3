package org.atom.springboot.people.management.app.service;

import java.util.List;

import org.atom.springboot.people.management.app.repository.InvoiceTransactionRepository;
import org.atom.springboot.people.management.app.repository.Merchant_LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtomService {

	@Autowired
	Merchant_LoginRepository merchant_LoginRepository;
	
	@Autowired
	InvoiceTransactionRepository invoiceTransactionRepository;

	public List<Object[]> getInfoByJoin(String string) {
		
		return merchant_LoginRepository.getInfoByJoin(string);
	}
}
