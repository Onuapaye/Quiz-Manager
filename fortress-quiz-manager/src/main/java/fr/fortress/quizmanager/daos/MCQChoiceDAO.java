package fr.fortress.quizmanager.daos;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Repository;

//import fr.epita.quiz.services.GenericORMDao;
//import fr.epita.quiz.services.WhereClauseBuilder;
import fr.fortress.quizmanager.model.MCQChoice;
import fr.fortress.quizmanager.services.WhereClauseBuilder;

@Repository
public class MCQChoiceDAO extends GenericORM_DAO_Abstract<MCQChoice> {

	@Override
	protected WhereClauseBuilder<MCQChoice> getWhereClauseBuilder(MCQChoice entity) {
		final WhereClauseBuilder<MCQChoice> whereClauseBuilder = new WhereClauseBuilder<>();
		whereClauseBuilder.setParameters(new LinkedHashMap<>());

		// TODO : load from configuration
		final String query = "from MCQChoice";

		whereClauseBuilder.setQueryString(query);
		return whereClauseBuilder;

	}
	
	@Override
	public boolean beforeCreate(MCQChoice entity) {
		return entity.getChoice() != null && entity.getQuestion() != null;

	}

}
