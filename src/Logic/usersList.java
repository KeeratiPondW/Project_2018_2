package Logic;

import java.util.ArrayList;

public class usersList {
	
	private ArrayList<users> user;
	
	public usersList() {
		user = new ArrayList<>();
		
	}
	
	public void addUsers(users u) {
		user.add(u);
	}

}
