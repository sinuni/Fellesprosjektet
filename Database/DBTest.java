package Database;

import java.util.ArrayList;
import java.util.Date;

import model.Appointment;
import model.Day;
import model.MeetTime;
import model.Meeting;
import model.Time;
import model.User;

public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		User test = new User("wtf");
		
		Appointment m�te = new Appointment("testem�te2", test, new MeetTime(new Time(12, 00), new Time(13, 00), Day.Friday, 52, 2012));
		DBAppointment.addAppointment(m�te);
		
		
//		m�te.setId(DBAppointment.getNewestID(m�te));
		
		System.out.println(m�te.getId());

	}

}
