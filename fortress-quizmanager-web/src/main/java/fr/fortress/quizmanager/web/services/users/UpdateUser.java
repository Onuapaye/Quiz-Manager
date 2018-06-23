package fr.fortress.quizmanager.web.services.users;

import fr.fortress.quizmanager.model.ApplicationUser;
import fr.fortress.quizmanager.services.ApplicationUserService;
import fr.fortress.quizmanager.web.services.SpringServlet;
import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/update-user")
public class UpdateUser extends SpringServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	@Inject
	ApplicationUserService appUserService;

	/**
	 * Default constructor.
	 */
	public UpdateUser() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/update-user.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ApplicationUser appUser = new ApplicationUser();

		final String username = request.getParameter("updateUser");
		List<ApplicationUser> lstUser = appUserService.getAllUser(appUser);

		for (int i = 0; i < lstUser.size(); i++) {
			if (username.equals(lstUser.get(i).getUserName())) {
				request.setAttribute("userName", lstUser.get(i).getUserFullName());
			} else {

			}
		}
		response.sendRedirect("update-user");

		final boolean updated = appUserService.updateApplicationUser(appUser);
		if (updated) {

		} else {
			request.getRequestDispatcher("/WEB-INF/views/update-user.jsp").forward(request, response);
		}
	}

}
