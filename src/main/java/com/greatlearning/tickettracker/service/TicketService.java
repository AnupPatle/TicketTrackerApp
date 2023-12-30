package com.greatlearning.tickettracker.service;

import java.util.List;


import com.greatlearning.tickettracker2211.entity.TicketTracker;

public interface TicketService {

	List<TicketTracker> getAllTickets();

	TicketTracker getTicketByID(int id);

	void saveTicket(TicketTracker ticket);

	int deleteByTicketId(int id);

	List<TicketTracker> searchTickets(String query);

}
