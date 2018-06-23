package fr.fortress.quizmanager.web.services;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.fortress.quizmanager.model.ApplicationUser;
import fr.fortress.quizmanager.model.Student;
import fr.fortress.quizmanager.services.StudentService;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/students")
public class StudentServlet extends SpringServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	StudentService studentServices;

	/**
	 * Default constructor.
	 */
	public StudentServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Student student = new Student();

		request.setAttribute("listOfStudents", studentServices.getAllStudents(student));
		request.getRequestDispatcher("/WEB-INF/views/student-list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final String student_Id = request.getParameter("updateStudent");

		Student student = new Student();

		List<Student> lstStudents = studentServices.getAllStudents(student);

		for (int i = 0; i < lstStudents.size(); i++) {
			if (student_Id.equals(lstStudents.get(i).getStudentEmail())) {
				
				request.setAttribute("studentEmail", lstStudents.get(i).getStudentEmail());
				request.setAttribute("firstName", lstStudents.get(i).getStudentFirstName());
				request.setAttribute("lastName", lstStudents.get(i).getStudentLastName());
				
				request.getRequestDispatcher("/WEB-INF/views/update-student.jsp").forward(request, response);
				
			}/* else {

				response.sendRedirect("users");
			}*/
		}
	}

}
