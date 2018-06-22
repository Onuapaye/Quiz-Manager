package fr.fortress.quizmanager.services;

import org.springframework.stereotype.Repository;

@Repository
public class AuthenticationService {

	public boolean authenticate(String login, String password) {
		// TODO get a real authentication later
		return true;
	}
}
