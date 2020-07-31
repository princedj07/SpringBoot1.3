package org.atom.springboot.book.ticket.app;

import java.util.Date;

import javax.sql.DataSource;

import org.atom.springboot.book.ticket.app.entities.Ticket;
import org.atom.springboot.book.ticket.app.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("application.properties")
public class Application {

	@Autowired
	TicketBookingService ticketBookingService;
	
	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * Ticket ticket = new Ticket(); ticket.setBookingDate(new Date());
	 * ticket.setDestStation("Mumbai"); ticket.setEmail("karan@gmail.com");
	 * ticket.setPassengerName("Prince"); ticket.setSourceStation("Kolhapur");
	 * ticketBookingService.createticket(ticket);
	 * 
	 * System.out.println("My DataSource is : "+dataSource);
	 * 
	 * }
	 */
	

// for test	
//http://localhost:8080/api/tickets/test

// create data
//http://localhost:8080/api/tickets/create
//{"ticketId":1,"passengerName":"Prince","bookingDate":"2020-04-13T11:53:27.033+0000","sourceStation":"Kolhapur","destStation":"Mumbai","email":"karan@gmail.com"}

// get by id
//http://localhost:8080/api/tickets/ticket/1

// get by alldata
//http://localhost:8080/api/tickets/ticket/alltickets

// delete by id
//http://localhost:8080/api/tickets/ticket/1

// update by id
//http://localhost:8080/api/tickets/ticket/1/xyz.dj@java.com
	
}
