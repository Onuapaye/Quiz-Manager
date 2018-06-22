package fr.fortress.quizmanager.daos;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import fr.fortress.quizmanager.model.Question;
import fr.fortress.quizmanager.services.WhereClauseBuilder;;

@Repository
public class QuestionDAO extends GenericORM_DAO_Abstract<Question>  {

	@Inject
	@Named("questionQuery")
	String query;
	
	private static final Logger LOGGER = LogManager.getLogger(QuestionDAO.class);

	public void createQuestion(Question question) {

		this.createRecord(question);
	}

	public void updateQuestion(Question question) {

		this.updateRecord(question);
	}

	public void deleteQuestion(Question question) {

		this.deleteRecord(question);
	}

	
	public List<Question> getByQuestionNamePassword(Question question) {

		List<Question> userList = null;

		try {

			userList = this.searchRecord(question);

		} catch (Exception e) {
			// handle exception
			LOGGER.error(
					"Error searching for exams record with error message: " + e.getMessage().toString());
		}

		return userList;
	}
/*
	public List<Question> getListOfAllQuestions(Question question) {

		List<Question> questionList = this.getListOfRecord(question);
		return questionList;
	}
	*/
	
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

	
}
