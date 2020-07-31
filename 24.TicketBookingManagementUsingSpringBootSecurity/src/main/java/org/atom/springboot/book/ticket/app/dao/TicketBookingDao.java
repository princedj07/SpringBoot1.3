package org.atom.springboot.book.ticket.app.dao;

import org.atom.springboot.book.ticket.app.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
