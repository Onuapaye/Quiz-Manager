package fr.fortress.quizmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Question", schema = "FORTRESSSCHEMA")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer questionId;

	@Column(name = "question", nullable = false, columnDefinition="VARCHAR(255)")
	private String questionTitle;
	
	@Column(name = "questionType", nullable = false, columnDefinition="VARCHAR(45)")
	private QuestionType questionType;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Exam examInQuestion;
	
	@Column(name = "questionInstruction", nullable = true, columnDefinition="VARCHAR(255)")
	private String questionInstruction;
	
	
	public Question() {
		
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public QuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}
	
	public String getQuestionInstruction() {
		return questionInstruction;
	}

	public void setQuestionInstruction(String questionInstruction) {
		this.questionInstruction = questionInstruction;
	}

	public Exam getExamInQuestion() {
		return examInQuestion;
	}

	public void setExamInQuestion(Exam examInQuestion) {
		this.examInQuestion = examInQuestion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((examInQuestion == null) ? 0 : examInQuestion.hashCode());
		result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
		result = prime * result + ((questionInstruction == null) ? 0 : questionInstruction.hashCode());
		result = prime * result + ((questionTitle == null) ? 0 : questionTitle.hashCode());
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
		if (examInQuestion == null) {
			if (other.examInQuestion != null)
				return false;
		} else if (!examInQuestion.equals(other.examInQuestion))
			return false;
		if (questionId == null) {
			if (other.questionId != null)
				return false;
		} else if (!questionId.equals(other.questionId))
			return false;
		if (questionInstruction == null) {
			if (other.questionInstruction != null)
				return false;
		} else if (!questionInstruction.equals(other.questionInstruction))
			return false;
		if (questionTitle == null) {
			if (other.questionTitle != null)
				return false;
		} else if (!questionTitle.equals(other.questionTitle))
			return false;
		if (questionType != other.questionType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionTitle=" + questionTitle + ", questionType="
				+ questionType + ", examInQuestion=" + examInQuestion + ", questionInstruction=" + questionInstruction
				+ "]";
	}
	
}
