package org.atom.springboot.book.ticket.app.controller;

import org.atom.springboot.book.ticket.app.entities.Ticket;
import org.atom.springboot.book.ticket.app.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;
	
	
	@GetMapping(value = "/test")
	public int test() {
		return 200;
	}
	
	@GetMapping(value="/tickets/ticketId/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId){
		return ticketBookingService.getTicketById(ticketId);
	}
	@GetMapping(value="/admin/tickets/alltickets")
	public Iterable<Ticket> getAllBookedTickets(){
		return ticketBookingService.getAllBookedTickets();
	}	
}
