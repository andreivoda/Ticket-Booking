package ticket.booking;

import ticket.booking.dao.CinemaDAO;
import ticket.booking.dao.CinemaImpl;
import ticket.booking.pojo.Cinema;

public class PopulateCinemaDB {
	public static void main(String[] args) {
		CinemaDAO cinemaDAO = new CinemaImpl();
		Cinema cinema = new Cinema("Inspiron", "Mercur Mall");
		cinemaDAO.insertCinema(cinema);
	}
}
