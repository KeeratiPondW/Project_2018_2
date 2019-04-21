package Logic;

import java.util.ArrayList;

public class UsersList {
	
	private ArrayList<Users> user;
	
	public UsersList() {
		user = new ArrayList<>();
		
	}
	
	public void addUsers(Users u) {
		user.add(u);
	}

}
