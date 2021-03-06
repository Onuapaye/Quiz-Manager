package fr.fortress.quizmanager.services;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import fr.fortress.quizmanager.daos.AnswerDAO;
import fr.fortress.quizmanager.model.Answer;

@Component
public class AnswerService {

	@Inject
	AnswerDAO answerDAO;

	public boolean createAnswer(Answer answer) {

		if (answer.getQuestion().getQuestionId() <= 0 || answer.getExam().getExamId() <= 0
				|| answer.getStudent().getStudentEmail().equals("")) {

			return false;
		} else {
			answerDAO.createAnswer(answer);
			return true;
		}

	}

	public boolean updateAnswer(Answer answer) {

		if (answer.getQuestion().getQuestionId() <= 0 || answer.getExam().getExamId() <= 0
				|| answer.getStudent().getStudentEmail().equals("")) {

			return false;
		} else {
			answerDAO.updateAnswer(answer);
			return true;
		}

	}

	/*public List<Answer> getAllAnswers(Answer answer) {

		List<Answer> answerList = answerDAO.getListOfAllAnswers(answer);
		return answerList;
	}*/

}
