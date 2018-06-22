package com.fortress.login;

public class LoginService {
	
	public boolean isUserValid(String username, String userpassword) {
		if (username.equals("bismark") && userpassword.equals("0000")) {
			return true;
		}else {
			return false;
		}
	}

}
