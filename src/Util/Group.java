package Util;

import java.util.ArrayList;

public class Group {
	
	ArrayList<Person> Members;
	
	public Group() {
		
		Members = new ArrayList<Person>();
	}
	
	public ArrayList<Person> getMembers() {
		return Members;
	}
	
	public void setMember(Person person) {
		Members.add(person);
	} 
	
	// Hauptmethode
	public String findSuperstar() {
		
		// Variable um Position des Superstars in Liste zu finden
		// Muss später angepasst werden
		int superstar = 0;
		
		for (int i = 0; i < Members.size(); i++) {
			
		}
		
		return Members.get(superstar).getName();
	}

}
