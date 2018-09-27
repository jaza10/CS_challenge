package Util;

import java.util.ArrayList;

public class Person {
	
	String name;
	ArrayList<Person> Follower;
	
	public Person(String name) {
		
		this.name = name;
		Follower = new ArrayList<Person>();
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Person> getFollower() {
		return Follower;
	}
	
	public void setFollower(Person person) {
		Follower.add(person);
	}
	
}
