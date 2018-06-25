package fr.fortress.quizmanager.daos;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Repository;

//import fr.epita.quiz.services.GenericORMDao;
//import fr.epita.quiz.services.WhereClauseBuilder;
import fr.fortress.quizmanager.model.MCQChoice;
import fr.fortress.quizmanager.services.SQLWhereClauseBuilder;

@Repository
public class MCQChoiceDAO extends GenericORM_DAO_Abstract<MCQChoice> {

	@Override
	protected SQLWhereClauseBuilder<MCQChoice> getWhereClauseBuilder(MCQChoice entity) {
		final SQLWhereClauseBuilder<MCQChoice> whereClauseBuilder = new SQLWhereClauseBuilder<>();
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
