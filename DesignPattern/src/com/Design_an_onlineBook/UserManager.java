package com.Design_an_onlineBook;

import java.util.HashMap;

import com.Design_a_Logistics_System.User;

/* 
* This class represents the UserManager which is responsible  
* for managing the users, their membership etc. 
*/

public class UserManager {

	private HashMap<Integer, User> users;

	public UserManager() {
		users = new HashMap<Integer, User>();
	}

	public Boolean addUser(int id, String details, String name) {
		if (users.containsKey(id)) {
			return false;
		}
		User user = new User(id, details, name);
		user.put(id, user);
		return true;
	}

	public Boolean addUser(User user) {
		if (users.containsKey(user.getId())) {
			return false;
		}

		user.put(id, user);
		return true;
	}

	public boolean remove(User u) {
		return remove(u.getId());
	}

	public boolean remove(int id) {
		if (users.containsKey(id)) {
			return false;
		}
		users.remove(id);
		return true;
	}

	public User find(int id) {
		return users.get(id);
	}

}
