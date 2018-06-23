package fr.fortress.quizmanager.daos;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import fr.fortress.quizmanager.model.MCQAnswer;
import fr.fortress.quizmanager.services.WhereClauseBuilder;

@Repository
public class MCQAnswerDAO extends GenericORM_DAO_Abstract<MCQAnswer> {

	@Inject
	@Named("mcq_answerQuery")
	String queryMCQ_Answer;

	private static final Logger LOGGER = LogManager.getLogger(MCQAnswerDAO.class);

	public void createMCQ_Answer(MCQAnswer mcq_answer) {

		this.createRecord(mcq_answer);
	}

	public void updateMCQ_Answer(MCQAnswer mcq_answer) {

		this.updateRecord(mcq_answer);
	}

	public void deleteMCQ_Answer(MCQAnswer mcq_answer) {

		this.deleteRecord(mcq_answer);
	}

	/**
	 * Search for the list of all application mcq_answer record as list of the application
	 * mcq_answer class that is passed as the parameter
	 * 
	 * @param applicationUser
	 * @return returns a list of application mcq_answers.
	 */
	/*public List<MCQAnswer> getByMCQ_Answer(MCQAnswer mcq_answer) {

		List<MCQAnswer> mcq_answerList = null;

		try {

			mcq_answerList = this.searchRecord(mcq_answer);

		} catch (Exception e) {
			// handle exception
			LOGGER.error(
					"Error searching for application mcq_answers recordr with error message: " + e.getMessage().toString());
		}

		return mcq_answerList;
	}*/

	public List<MCQAnswer> getListOfAllMCQ_Answers(MCQAnswer mcq_answer){
		
		List<MCQAnswer> mcq_answerList = this.getListOfRecord(mcq_answer);
		return mcq_answerList;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	protected WhereClauseBuilder getWhereClauseBuilder(MCQAnswer entity) {

		final WhereClauseBuilder<MCQAnswer> wcb = new WhereClauseBuilder<>();
		wcb.setQueryString(queryMCQ_Answer);

		try {

			// let the whereclausebuilder generate this map thanks to introspection
			final Map<String, Object> parameters = new LinkedHashMap<>();

			parameters.put("mcq_answer_id", entity.getMcqAnswerId());
			parameters.put("mcq_choice_id", entity.getMcqChoice().getId());
			parameters.put("mcq_student_id", entity.getStudent().getStudentEmail());
			parameters.put("mcq_exam_id", entity.getExam().getExamId());
			
			wcb.setParameters(parameters);

		} catch (Exception e) {
			// handle exception
			LOGGER.error(
					"Error searching for application mcq_answer record with error message: " + e.getMessage().toString());
		}

		return wcb;
	}
}
