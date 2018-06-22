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
@Table(name ="Answer", schema = "FORTRESSSCHEMA")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "answerId")
	private int answerId;
	
	@ManyToOne
	@JoinColumn(name="questionId", nullable = false)
	private Question question;
	
	@ManyToOne
	@JoinColumn(name="examId", nullable = false)
	private Exam exam;
	
	@ManyToOne
	@JoinColumn(name="studentEmail_Id", nullable = false)
	private Student student;
	
	
	
	
	public Answer() {
	
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public Exam getExam() {
		return exam;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
}
