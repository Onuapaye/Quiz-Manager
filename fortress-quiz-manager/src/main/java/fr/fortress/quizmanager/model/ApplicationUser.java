package fr.fortress.quizmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ApplicationUser", schema = "FORTRESSSCHEMA")
public class ApplicationUser {

	@Id
	@Column(name = "userName", unique = true, nullable = false, columnDefinition="VARCHAR(45)")
	private String userName;
	
	@Column(name = "userPassword", nullable = false, columnDefinition="VARCHAR(25)")
	private String userPassword;
	
	@Column(name = "userFullName", nullable = false, length = 255)
	private String userFullName;

	//default constructor
	public ApplicationUser() {
		
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	@Override
	public String toString() {
		return "ApplicationUser [userName=" + userName + ", userPassword=" + userPassword + ", userFullName="
				+ userFullName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userFullName == null) ? 0 : userFullName.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationUser other = (ApplicationUser) obj;
		if (userFullName == null) {
			if (other.userFullName != null)
				return false;
		} else if (!userFullName.equals(other.userFullName))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		return true;
	}
	
	
}
