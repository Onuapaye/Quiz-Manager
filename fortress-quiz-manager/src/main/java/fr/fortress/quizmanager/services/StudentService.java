package fr.fortress.quizmanager.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import fr.fortress.quizmanager.daos.StudentDAO;
import fr.fortress.quizmanager.model.Student;

@Component
public class StudentService {

	@Inject
	StudentDAO studentDAO;

	public boolean isStudentAuthenticated(String studentEmail) {

		Student student = new Student();
		student.setStudentEmail(studentEmail);
		/*
		 * student.setStudentFirstName(studentFirstName);
		 * student.setStudentLastName(studentLastName);
		 */

		List<Student> studentList = studentDAO.searchRecord(student);

		int count = studentList.size();
		boolean result = false;

		for (int i = 0; i < count; i++) {

			if (student.getStudentEmail().equals(studentList.get(i).getStudentEmail())) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;

	}

	public boolean createStudent(Student student) {

		if (student.getStudentEmail().equals(null) || student.getStudentEmail().equals("")) {

			return false;
		} else {
			studentDAO.createStudent(student);
			return true;
		}

	}

	public boolean updateStudent(Student student) {

		if (student.getStudentEmail().equals("")) {

			return false;
		} else {
			studentDAO.updateStudent(student);
			return true;
		}

	}

	/*public List<Student> getAllStudents(Student student) {

		List<Student> studentList = studentDAO.getListOfAllStudents(student);
		return studentList;
	}*/

}
