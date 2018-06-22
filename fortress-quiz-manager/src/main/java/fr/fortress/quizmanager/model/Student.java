package fr.fortress.quizmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Student", schema = "FORTRESSSCHEMA")
public class Student {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="studentEmail_Id", unique = true, nullable = false, columnDefinition="VARCHAR(45)")
	String studentEmail;
	
	@Column(name="studentFirstName", length=45, nullable = false)
	String studentFirstName;
	
	@Column(name="studentLastName", length=45, nullable = false)
	String studentLastName;

	@Column(name = "studentPassword", nullable = false, columnDefinition="VARCHAR(25)")
	private String studentPassword;
	
	
	public Student() {
		
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	@Override
	public String toString() {
		return "Student [studentEmail=" + studentEmail + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentPassword=" + studentPassword + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentEmail == null) ? 0 : studentEmail.hashCode());
		result = prime * result + ((studentFirstName == null) ? 0 : studentFirstName.hashCode());
		result = prime * result + ((studentLastName == null) ? 0 : studentLastName.hashCode());
		result = prime * result + ((studentPassword == null) ? 0 : studentPassword.hashCode());
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
		Student other = (Student) obj;
		if (studentEmail == null) {
			if (other.studentEmail != null)
				return false;
		} else if (!studentEmail.equals(other.studentEmail))
			return false;
		if (studentFirstName == null) {
			if (other.studentFirstName != null)
				return false;
		} else if (!studentFirstName.equals(other.studentFirstName))
			return false;
		if (studentLastName == null) {
			if (other.studentLastName != null)
				return false;
		} else if (!studentLastName.equals(other.studentLastName))
			return false;
		if (studentPassword == null) {
			if (other.studentPassword != null)
				return false;
		} else if (!studentPassword.equals(other.studentPassword))
			return false;
		return true;
	}

	

	
	
}
