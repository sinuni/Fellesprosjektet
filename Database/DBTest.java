package Database;

import java.util.ArrayList;
import java.util.Date;

import model.Appointment;
import model.Meeting;
import model.MeetingRoom;
import model.User;

public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		ArrayList<User> users = new ArrayList<User>();
		User test = new User("wtf");
		users.add(test);
		Appointment m�te = new Appointment(new Date(), "testing", 1, 2, test);

		m�te.setId(DBAppointment.addAppointment(m�te));
		
		System.out.println(m�te.getId());

	}

}
