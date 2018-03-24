package com.bm.rest.webservices.restfulwebservices;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 3;
	
	static {
		
		users.add(new User("Adam",1,new Date()));
		users.add(new User("Eve",2, new Date()));
		users.add(new User("Jack",3, new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId()== null) {
			user.setId(++userCount);
		}
			users.add(user);
			return user;
		
	}
	
	public User findOne(int id) {
		
		for(User user:users) {
			if(user.getId() == id) {
				return user;	
			}				
			
		}
		return null;
		
	}

}
