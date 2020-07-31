package org.atom.springboot.people.management.app.repository;

import org.atom.springboot.people.management.app.model.InvoiceTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceTransactionRepository extends JpaRepository<InvoiceTransaction, Integer>{

}
