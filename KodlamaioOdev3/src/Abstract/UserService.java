package Abstract;

import Entities.User;

public interface UserService {
	void add(User User);
	void delete(User User);
	void update(User User);
	void getAll();
}
