package fr.fortress.quizmanager.daos;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import fr.fortress.quizmanager.model.Student;
import fr.fortress.quizmanager.services.WhereClauseBuilder;

@Repository
public class StudentDAO extends GenericORM_DAO_Abstract<Student> {

	
	@Inject
	@Named("studentQuery")
	String queryStudent;
	
	@Inject
	@Named("allStudentQuery")
	String getAllStudentsQuery;

	private static final Logger LOGGER = LogManager.getLogger(StudentDAO.class);

	public void createStudent(Student student) {

		this.createRecord(student);
	}

	public void updateStudent(Student student) {

		this.updateRecord(student);
	}

	public void deleteStudent(Student student) {

		this.deleteRecord(student);
	}

	/**
	 * Search for the list of all application student record as list of the application
	 * student class that is passed as the parameter
	 * 
	 * @param applicationUser
	 * @return returns a list of application students.
	 */
	public List<Student> getByStudentNamePassword(Student student) {

		List<Student> studentList = null;

		try {

			studentList = this.searchRecord(student);

		} catch (Exception e) {
			// handle exception
			LOGGER.error(
					"Error searching for application students recordr with error message: " + e.getMessage().toString());
		}

		return studentList;
	}

	public List<Student> getListOfAllStudents(Student student){
		
		List<Student> studentList = this.getListOfRecord(student, getAllStudentsQuery);
		return studentList;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	protected WhereClauseBuilder getWhereClauseBuilder(Student entity) {

		final WhereClauseBuilder<Student> wcb = new WhereClauseBuilder<>();
		wcb.setQueryString(queryStudent);

		try {

			// let the whereclausebuilder generate this map thanks to introspection
			final Map<String, Object> parameters = new LinkedHashMap<>();

			parameters.put("studentEmail", entity.getStudentEmail());

			wcb.setParameters(parameters);

		} catch (Exception e) {
			// handle exception
			LOGGER.error(
					"Error searching for application student record with error message: " + e.getMessage().toString());
		}

		return wcb;
	}


}
