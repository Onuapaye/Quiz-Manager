package fr.fortress.quizmanager.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import fr.fortress.quizmanager.daos.MCQAnswerDAO;
import fr.fortress.quizmanager.model.MCQAnswer;

@Component
public class MCQAnswerService {

	@Inject
	MCQAnswerDAO mcq_answerDAO;

	public boolean createExam(MCQAnswer mcq_answer) {

		if (mcq_answer.getMcqChoice().getId().equals(null) || mcq_answer.getStudent().getStudentEmail().equals(null)) {

			return false;
		} else {
			mcq_answerDAO.createMCQ_Answer(mcq_answer);
			return true;
		}

	}

	public boolean updateExam(MCQAnswer mcq_answer) {

		if (mcq_answer.getMcqAnswerId() <= 0) {

			return false;
		} else {
			mcq_answerDAO.updateMCQ_Answer(mcq_answer);
			return true;
		}

	}

	public List<MCQAnswer> getAllExams(MCQAnswer mcq_answer) {

		List<MCQAnswer> mcq_answerList = mcq_answerDAO.getListOfAllMCQ_Answers(mcq_answer);
		return mcq_answerList;
	}
}
