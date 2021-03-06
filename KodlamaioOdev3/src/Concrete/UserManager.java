package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	private List<User> users = new ArrayList<User>();
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if (this.userCheckService.IsPerson(user)) {
			this.users.add(user);
			System.out.println(user.getFirstName() + " User added!");
		}else {
			System.err.println("Your are not real user!");
		}	
	}

	@Override
	public void update(User user) {
		if (this.userCheckService.IsPerson(user)) {
			boolean isData=false;
			int index = 0;
			for (int i=0; i<this.users.size();i++) {
				User user1 = this.users.get(i);
				if (user.getId()==user1.getId()) {
					index = i;
					isData=true;
					break;
				}
			}
			if (isData) {
				this.users.set(index, user);
				System.out.println(user.getFirstName() + " user updated!");
			}else {			
				System.err.println("Data not found!");
			}
		}else {
			System.err.println("You are not real customer.Take care your information again.!");
		}	
		
	}

	@Override
	public void delete(User user) {
		this.delete(user);
		System.out.println(user.getFirstName() + " customer deleted!");
			
	}

	@Override
	public void getAll() {
		for (User user : users) {
			System.out.println( "Id : " + user.getId() +" Name : " +user.getFirstName() + " Surname : " + user.getLastName() + " Nationality Id : " + user.getNationalityId() +  " Born Date : "+ user.getBornDate() );
		}
	}
}
