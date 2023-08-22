package com.user.user.services;

import java.util.List;

import com.user.user.entities.Details;

public interface UserService {
	

	public List<Details> getUser();

	public Details getUser(int user_id);

	public Details addUser(Details details);


	public Details updateUser(Details details);


	public void deleteUser(int parseInt);

	

	

	

	
}
