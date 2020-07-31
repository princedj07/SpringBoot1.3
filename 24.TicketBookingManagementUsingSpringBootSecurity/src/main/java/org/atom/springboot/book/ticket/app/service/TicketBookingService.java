package org.atom.springboot.book.ticket.app.service;

import java.util.Optional;

import org.atom.springboot.book.ticket.app.dao.TicketBookingDao;
import org.atom.springboot.book.ticket.app.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createticket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}

	public Optional<Ticket> getTicketById(Integer ticketId) {
		System.out.println("ticketBookingDao****getTicketById");
		return ticketBookingDao.findById(ticketId);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		
		return ticketBookingDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		
		ticketBookingDao.deleteById(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
	
		Ticket ticketFromdb = ticketBookingDao.findById(ticketId).get();
		ticketFromdb.setEmail(newEmail);
		Ticket updateTicket = ticketBookingDao.save(ticketFromdb);
		return updateTicket;
	}

	

	


}
