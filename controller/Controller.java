package controller;

import java.util.ArrayList;
import java.util.Date;

import model.Change;
import model.Meeting;
import model.MeetingRoom;
import model.User;

public class Controller {

	private User currentUser;
	private Meeting currentMeeting;
	private ArrayList<MeetingRoom> rooms;
	
	public void setCurrentMeeting(Meeting meeting){
		this.currentMeeting = meeting;
	}
	public void setCurrentUser(User user){
	this.currentUser = user;
	//oppdatere user
	}
	public User getCurrentUser(){
		return currentUser;
	}
	public Meeting getCurrentMeeting(){
		return currentMeeting;
	}
	
	public void newMeeting(){
		
		
		
//		this.currentMeeting = new Meeting(new ArrayList<User>(), new MeetingRoom(), new Date(), "", currentUser);
//		m� hente meetingrooms, kan ikke lage nytt rom for m�tet.
		
	}
	
	
	public void editMeeting(Change change){
		switch (change) {
		case REMOVE_PARTICIPANT: //TODO: slette bruker fra m�tet
		case ADD_PARTICIPANT: //TODO: legge til bruker til m�tet
		case ROOM: //TODO: sende melding om at rommet er endret
		case TIME: //TODO: sende melding om at tiden er endret
		case CANCELLED: //TODO: sende melding om at m�tet er avlyst
			break;

		default:System.out.println("Noe ble endret, men vet ikke hva!");
		break;
		}
	}

	public void deleteMeeting(){
		
	}

	public void addParticipant(User participant){
		//changeListener med ADD_PARTICIPANT

	}
	public void removeParticipant(User participant){
		//ChangeListener med REMOVE_PARTICIPANT
	}
	
	
}
