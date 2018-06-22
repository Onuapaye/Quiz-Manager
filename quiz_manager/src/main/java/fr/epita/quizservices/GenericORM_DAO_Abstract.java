/**
 * 
 */
package fr.epita.quizservices;

import java.util.List;
import java.util.Map.Entry;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

/**
 * @author Mr Kasapa
 *
 */
public abstract class GenericORM_DAO_Abstract<T> {

	//Inject the session factory to help call the session methods
		@Inject
		SessionFactory sf;
		
		public final void createQuestion(T entity) {
			final Session session = sf.openSession();
			session.save(entity);
		}

		public final void updateQuestion(T entity) {
			final Session session = sf.openSession();
			session.update(entity);
		}

		public final void deleteQuestion(T entity) {
			final Session session = sf.openSession();
			session.delete(entity);
		}

		public List<T> searchQuestion(T entity) {
			
			final Session session = sf.openSession();
			final WhereClauseBuilder<T> wcb = getWhereClauseBuilder(entity);
			final Query searchQuery = session.createQuery(wcb.getQueryString());
			
			for (final Entry<String, Object> parameterEntry : wcb.getParameters().entrySet()) {
				searchQuery.setParameter(parameterEntry.getKey(), parameterEntry.getValue());
			}

			return searchQuery.list();
		}

		protected abstract WhereClauseBuilder getWhereClauseBuilder(T entity);
		
		
}
