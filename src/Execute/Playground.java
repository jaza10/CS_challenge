package Execute;

import Util.*;

public class Playground {

	public static void main(String[] args) {
		
		// Instantiate Persons
		Person aaron = new Person("Aaron");
		Person bertha = new Person("Bertha");
		Person chris = new Person("Chris");
		
		// Create Follower structures
		aaron.setFollower(bertha);
		bertha.setFollower(aaron);
		chris.setFollower(aaron);
		chris.setFollower(bertha);
		
		// Create Group
		Group superGroup = new Group();
		superGroup.setMember(aaron);
		superGroup.setMember(bertha);
		superGroup.setMember(chris);
		
		superGroup.findSuperstar();

	}

}
