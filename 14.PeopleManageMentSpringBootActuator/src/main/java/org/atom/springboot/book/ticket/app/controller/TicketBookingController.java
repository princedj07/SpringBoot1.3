package org.atom.springboot.book.ticket.app.controller;

import java.util.Optional;

import org.atom.springboot.book.ticket.app.entities.Ticket;
import org.atom.springboot.book.ticket.app.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		System.out.println(" json data : "+ticket.toString());
		return ticketBookingService.createticket(ticket);
	}
	
	@GetMapping(value = "/test")
	public int test() {
		return 200;
	}
	
	@GetMapping(value = "/ticket/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId) {
		System.out.println("getTicketById************************************");
		return ticketBookingService.getTicketById(ticketId);
	}

	
	@GetMapping(value = "/ticket/alltickets")
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingService.getAllBookedTickets();
	}

	@DeleteMapping(value = "/ticket/{delticketId}")
	public void deleteTicket(@PathVariable("delticketId") Integer ticketId) {
		 ticketBookingService.deleteTicket(ticketId);
	}
	
	@PutMapping(value = "ticket/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId, @PathVariable("newEmail") String newEmail) {
		return ticketBookingService.updateTicket(ticketId,newEmail);
	}
	
}
