package fr.fortress.quizmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Question", schema = "FORTRESSSCHEMA")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String question;
	private QuestionType questionType;
	
	public Question() {
		
	}
	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the questionId
	 */
	public Integer getQuestionId() {
		return id;
	}
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(Integer questionId) {
		this.id = questionId;
	}
	/**
	 * @return the questionType
	 */
	public QuestionType getQuestionType() {
		return questionType;
	}
	/**
	 * @param questionType the questionType to set
	 */
	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((questionType == null) ? 0 : questionType.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (questionType != other.questionType)
			return false;
		return true;
	}
	
	
}