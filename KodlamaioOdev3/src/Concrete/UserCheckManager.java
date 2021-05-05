package Concrete;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService {
	
	public boolean IsPerson(User user) {
		return true;
	}
	
}
