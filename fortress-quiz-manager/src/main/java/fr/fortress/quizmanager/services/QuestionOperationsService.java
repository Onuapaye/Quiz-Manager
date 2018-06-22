
package fr.fortress.quizmanager.services;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import fr.fortress.quizmanager.daos.MCQChoiceDAO;
import fr.fortress.quizmanager.daos.QuestionDAO;
import fr.fortress.quizmanager.model.MCQChoice;
import fr.fortress.quizmanager.model.Question;

@Component
public class QuestionOperationsService {

	@Inject
	private MCQChoiceDAO mcqChoicedao;

	@Inject
	private QuestionDAO questiondao;

	@Inject
	private SessionFactory factory;

	// @Transactional
	// TODO check that in a further lecture
	public void deleteQuestion(Question question) {
		final Transaction transaction = factory.openSession().beginTransaction();
		final MCQChoice criteria = new MCQChoice();
		criteria.setQuestion(question);
		final List<MCQChoice> choicesList = mcqChoicedao.searchRecord(criteria);
		for (final MCQChoice choice : choicesList) {
			mcqChoicedao.deleteRecord(choice);
		}
		questiondao.deleteRecord(question);
		transaction.commit();
	}

}