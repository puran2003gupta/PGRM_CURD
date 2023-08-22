package com.user.user.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.user.user.entities.Details;

@Service
public class UserServiceImpl implements UserService {
	List<Details> list;
	public UserServiceImpl() {
		list = new ArrayList<>();
		list.add(new Details(145, "Puran", "xyz@gmail.com", "4578986532", "software emp", "xyx", "xyz"));
		list.add(new Details(146, "Tejas", "abc@gmail.com", "4578984532", "kuch bada", "abc", "abc"));
	} 	

	@Override
	public List<Details> getUser() {
		
		return list;
	}

	@Override
	public Details getUser(int user_id) {
		Details d=null;
		for(Details details:list) {
			if(details.getUser_id()==user_id) {
				d=details;
				break;
			}
		}
		return d;
	}

	@Override
	public Details addUser(Details details) {
			list.add(details);
			return details;
		}

	@Override
	public Details updateUser(Details details) {
		
				list.forEach(e->{
				if(e.getUser_id()==details.getUser_id())
				{
					e.setUser_name(details.getUser_name());
					e.setUser_email(details.getUser_email());
					e.setUser_mobile(details.getUser_mobile());
					e.setUser_profession(details.getUser_profession());
					e.setUser_pass(details.getUser_pass());
					e.setUser_Cpass(details.getUser_Cpass());
					
				}
				});
			return details;
		}

	@Override
	public void deleteUser(int parseInt) {
		
			 list = this.list.stream()
			            .filter(e -> e.getUser_id() != parseInt)
			            .collect(Collectors.toList());
			    
		}
		
	}
		
	


