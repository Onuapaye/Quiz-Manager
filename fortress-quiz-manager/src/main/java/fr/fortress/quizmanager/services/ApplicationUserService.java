package fr.fortress.quizmanager.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import fr.fortress.quizmanager.daos.ApplicationUserDAO;
import fr.fortress.quizmanager.model.ApplicationUser;

@Component
public class ApplicationUserService {

	@Inject
	ApplicationUserDAO userDAO;

	public boolean isUserAuthenticated(String username, String userpassword) {

		ApplicationUser user = new ApplicationUser();
		user.setUserName(username);
		user.setUserPassword(userpassword);

		List<ApplicationUser> userList = userDAO.searchRecord(user);

		int count = userList.size();
		boolean result = false;

		for (int i = 0; i < count; i++) {

			if (user.getUserName().equals(userList.get(i).getUserName())
					&& user.getUserPassword().equals(userList.get(i).getUserPassword())) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;

	}

	public boolean createApplicationUser(ApplicationUser applicationUser) {

		if (applicationUser.getUserFullName().equals(null) || applicationUser.getUserName().equals("")
				|| applicationUser.getUserPassword().equals("")) {

			return false;
		} else {
			userDAO.createApplicationUser(applicationUser);
			return true;
		}

	}

	public boolean updateApplicationUser(ApplicationUser applicationUser) {

		if (applicationUser.getUserFullName().equals(null)
				|| applicationUser.getUserPassword().equals("")) {

			return false;
		} else {
			userDAO.updateApplicationUser(applicationUser);
			return true;
		}

	}

	public List<ApplicationUser> getAllUser(ApplicationUser applicationUser) {

		List<ApplicationUser> userList = userDAO.getListOfAllUsers(applicationUser);
		return userList;
	}

}
