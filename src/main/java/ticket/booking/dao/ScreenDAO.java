package ticket.booking.dao;

import java.util.List;

import ticket.booking.pojo.Screen;

// ScreenDAO interface which defines a set of CRUD methods to be implemented.
public interface ScreenDAO {
	public List<Screen> getAllScreens();
	public Screen getScreen(int id);
	public boolean insertScreen(Screen screen);
	public boolean updateScreen(Screen screen);
	public boolean deleteScreen(Screen screen);
}
