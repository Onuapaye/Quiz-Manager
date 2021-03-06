package fr.fortress.quizmanager.daos;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import fr.fortress.quizmanager.model.Answer;
import fr.fortress.quizmanager.services.SQLWhereClauseBuilder;

@Repository
public class AnswerDAO extends GenericORM_DAO_Abstract<Answer> {

	@Inject
	@Named("answerQuery")
	String queryAnswer;

	private static final Logger LOGGER = LogManager.getLogger(AnswerDAO.class);

	public void createAnswer(Answer answer) {

		this.createRecord(answer);
	}

	public void updateAnswer(Answer answer) {

		this.updateRecord(answer);
	}

	public void deleteAnswer(Answer answer) {

		this.deleteRecord(answer);
	}

	/**
	 * Search for the list of all application answer record as list of the application
	 * answer class that is passed as the parameter
	 * 
	 * @param applicationUser
	 * @return returns a list of application answers.
	 */
	public List<Answer> getByAnswerNamePassword(Answer answer) {

		List<Answer> answerList = null;

		try {

			answerList = this.searchRecord(answer);

		} catch (Exception e) {
			// handle exception
			LOGGER.error(
					"Error searching for application answers recordr with error message: " + e.getMessage().toString());
		}

		return answerList;
	}

	/*public List<Answer> getListOfAllAnswers(Answer answer){
		
		List<Answer> answerList = this.getListOfRecord(answer);
		return answerList;
	}*/
	
	@SuppressWarnings("rawtypes")
	@Override
	protected SQLWhereClauseBuilder getWhereClauseBuilder(Answer entity) {

		final SQLWhereClauseBuilder<Answer> wcb = new SQLWhereClauseBuilder<>();
		wcb.setQueryString(queryAnswer);

		try {

			// let the whereclausebuilder generate this map thanks to introspection
			final Map<String, Object> parameters = new LinkedHashMap<>();

			parameters.put("answer_id", entity.getAnswerId());
			parameters.put("question_id", entity.getQuestion());
			parameters.put("exam_id", entity.getExam());
			parameters.put("student_id", entity.getStudent());
			
			wcb.setParameters(parameters);

		} catch (Exception e) {
			// handle exception
			LOGGER.error(
					"Error searching for application answer record with error message: " + e.getMessage().toString());
		}

		return wcb;
	}
}
