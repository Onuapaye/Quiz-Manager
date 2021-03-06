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
import fr.fortress.quizmanager.services.SQLWhereClauseBuilder;;

@Repository
public class QuestionDAO extends GenericORM_DAO_Abstract<Question>  {

	@Inject
	@Named("questionQuery")
	String queryQuestions;
	
	@Inject
	@Named("allQuestionsQuery")
	String getAllQuestionsQuery;
	
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

	public List<Question> getListOfAllQuestions(Question question) {

		List<Question> questionList = this.getListOfRecord(question, getAllQuestionsQuery);
		return questionList;
	}
	
	
	@Override
	protected SQLWhereClauseBuilder<Question> getWhereClauseBuilder(Question entity) {
		
		final SQLWhereClauseBuilder<Question> wcb = new SQLWhereClauseBuilder<>();
		wcb.setQueryString(queryQuestions);

		// TODO as bonus : let the whereclausebuilder generate this map thanks to introspection
		final Map<String, Object> parameters = new LinkedHashMap<>();
		parameters.put("questionId", entity.getQuestionId());
		parameters.put("questionType", entity.getQuestionType());
		parameters.put("questionTitle", entity.getQuestionTitle());
		parameters.put("examId", entity.getExamInQuestion());
		wcb.setParameters(parameters);
		return wcb;
	}

	
}
