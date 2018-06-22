package fr.fortress.quizmanager.daos;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Repository;

import fr.fortress.quizmanager.model.Question;
import fr.fortress.quizmanager.services.WhereClauseBuilder;;

@Repository
public class QuestionDAO extends GenericORM_DAO_Abstract<Question>  {

	@Inject
	@Named("questionQuery")
	String query;
	
	@Override
	protected WhereClauseBuilder<Question> getWhereClauseBuilder(Question entity) {
		
		final WhereClauseBuilder<Question> wcb = new WhereClauseBuilder<>();
		wcb.setQueryString(query);

		// TODO as bonus : let the whereclausebuilder generate this map thanks to introspection
		final Map<String, Object> parameters = new LinkedHashMap<>();
		parameters.put("type", entity.getQuestionType());
		parameters.put("question", entity.getQuestion());
		wcb.setParameters(parameters);
		return wcb;
	}

	
	/*@Override
	protected String getSearchQuery() {
		// TODO Auto-generated method stub
		return null;
	}*/

	
	
}
