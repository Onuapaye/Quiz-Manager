/**
 * 
 */
package fr.fortress.quizmanager.daos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map.Entry;

import javax.inject.Inject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import fr.fortress.quizmanager.services.WhereClauseBuilder;

/**
 * @author Mr Kasapa
 *
 */
@Repository
public abstract class GenericORM_DAO_Abstract<T> {

	// Inject the session factory to help call the session methods
	@Inject
	SessionFactory sf;

	private static final Logger LOGGER = LogManager.getLogger(ApplicationUserDAO.class);

	/**
	 * A generic method to create or insert a record by passing the appropriate
	 * object as a parameter
	 * 
	 * @param entity
	 */
	public final void createRecord(T entity) {
		
		if (!beforeCreate(entity)) {
			return;
		}

		
		Transaction transactions = null;
		try {

			final Session session = sf.openSession();
			transactions = session.beginTransaction();

			session.save(entity);

			transactions.commit();

		} catch (Exception e) {
			transactions.rollback();

			LOGGER.error("Error creating application user record with error message: " + e.getMessage().toString());
		}

	}

	/**
	 * A generic method to update a record by passing the appropriate object as a
	 * parameter
	 * 
	 * @param entity
	 */
	public final void updateRecord(T entity) {
		
		final Session session = sf.openSession();
		Transaction transactions = null;
		
		try {

			transactions = session.beginTransaction();

			session.update(entity);
			
			transactions.commit();

		} catch (Exception e) {
			
			transactions.rollback();
			
		}
	}

	/**
	 * A generic method to delete a record by passing the appropriate object as a
	 * parameter
	 * 
	 * @param entity
	 */
	public final void deleteRecord(T entity) {
		final Session session = sf.openSession();
		Transaction transactions = null;
		try {

			transactions = session.beginTransaction();

			session.delete(entity);

			transactions.commit();

		} catch (Exception e) {
			transactions.rollback();
			this.closeSession();

			LOGGER.error("Error deleting application user record with error message: " + e.getMessage().toString());
		}

	}

	/**
	 * A generic method to query all records from a defined database on the bases of the
	 * object that is passed to it as a parameter
	 * @param the object that is passed
	 * @param the query string to be passed and executed
	 * @return
	 */
	public List<T> getListOfRecord(T entity, String queryString) {
		
		final Session sessions = sf.openSession();
		Transaction transactions = null;
		List<T> listOfRecord = null;
		try {
			
			transactions = sessions.beginTransaction();
			Query query = sessions.createQuery(queryString); 
			listOfRecord = query.list();

			transactions.commit();		
		} catch (Exception e) {

			transactions.rollback();
			//this.closeSession();
			
			listOfRecord = null;
		}
				
		return listOfRecord;
	}
	/**
	 * A method to close the session factory after it has been called or used
	 */
	public final void closeSession() {
		if (sf.isOpen()) {
			sf.close();
		}
	}

	/**
	 * A generic method to query or search for records. It accepts as a parameter,
	 * the object or entity passed to it
	 * 
	 * @param entity
	 * @return a list of records
	 */
	public List<T> searchRecord(T entity) {

		final Session session = sf.openSession();

		final WhereClauseBuilder<T> wcb = getWhereClauseBuilder(entity);

		final Query searchQuery = session.createQuery(wcb.getQueryString());

		for (final Entry<String, Object> parameterEntry : wcb.getParameters().entrySet()) {
			searchQuery.setParameter(parameterEntry.getKey(), parameterEntry.getValue());
		}

		return searchQuery.list();
	}

	protected abstract WhereClauseBuilder getWhereClauseBuilder(T entity);

	public boolean beforeCreate(T entity) {
		return entity != null;
	}

}
