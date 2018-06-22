package fr.fortress.quizmanager.daos;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import fr.fortress.quizmanager.model.ApplicationUser;
import fr.fortress.quizmanager.services.WhereClauseBuilder;

@Repository
public class ApplicationUserDAO extends GenericORM_DAO_Abstract<ApplicationUser> {

	@Inject
	@Named("userQuery")
	String queryUser;

	private static final Logger LOGGER = LogManager.getLogger(ApplicationUserDAO.class);

	public void createApplicationUser(ApplicationUser applicationUser) {

		this.createRecord(applicationUser);
	}

	public void updateApplicationUser(ApplicationUser applicationUser) {

		this.updateRecord(applicationUser);
	}

	public void deleteApplicationUser(ApplicationUser applicationUser) {

		this.deleteRecord(applicationUser);
	}

	/**
	 * Search for the list of all application user record as list of the application
	 * user class that is passed as the parameter
	 * 
	 * @param applicationUser
	 * @return returns a list of application users.
	 */
	public List<ApplicationUser> getUserByUserNamePassword(ApplicationUser applicationUser) {

		List<ApplicationUser> userList = null;

		try {

			userList = this.searchRecord(applicationUser);

		} catch (Exception e) {
			// handle exception
			LOGGER.error(
					"Error searching for application users recordr with error message: " + e.getMessage().toString());
		}

		return userList;
	}

	public List<ApplicationUser> getListOfAllUsers(ApplicationUser applicationUser){
		
		List<ApplicationUser> userList = this.getListOfRecord(applicationUser);
		return userList;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	protected WhereClauseBuilder getWhereClauseBuilder(ApplicationUser entity) {

		final WhereClauseBuilder<ApplicationUser> wcb = new WhereClauseBuilder<>();
		wcb.setQueryString(queryUser);

		try {

			// let the whereclausebuilder generate this map thanks to introspection
			final Map<String, Object> parameters = new LinkedHashMap<>();

			parameters.put("userName", entity.getUserName());
			parameters.put("userPassword", entity.getUserPassword());
			wcb.setParameters(parameters);

		} catch (Exception e) {
			// handle exception
			LOGGER.error(
					"Error searching for application user record with error message: " + e.getMessage().toString());
		}

		return wcb;
	}

}