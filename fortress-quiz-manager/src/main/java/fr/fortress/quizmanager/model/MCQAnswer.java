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
@Table(name ="MCQAnswer", schema = "FORTRESSSCHEMA")
public class MCQAnswer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mcqAnswerId")
	private int mcqAnswerId;
	
	@ManyToOne
	@JoinColumn(name="mcqchoiceId", nullable = false)
	private MCQChoice mcqChoice;
	
	@ManyToOne
	@JoinColumn(name="studentEmail_Id", nullable = false)
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="examId", nullable = false)
	private Exam exam;
	
	
	public MCQAnswer() {
		
	}
	
	public int getMcqAnswerId() {
		return mcqAnswerId;
	}

	public void setMcqAnswerId(int mcqAnswerId) {
		this.mcqAnswerId = mcqAnswerId;
	}

	public MCQChoice getMcqChoice() {
		return mcqChoice;
	}
	
	public void setMcqChoice(MCQChoice mcqChoice) {
		this.mcqChoice = mcqChoice;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Exam getExam() {
		return exam;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((exam == null) ? 0 : exam.hashCode());
		result = prime * result + mcqAnswerId;
		result = prime * result + ((mcqChoice == null) ? 0 : mcqChoice.hashCode());
		result = prime * result + ((student == null) ? 0 : student.hashCode());
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
		MCQAnswer other = (MCQAnswer) obj;
		if (exam == null) {
			if (other.exam != null)
				return false;
		} else if (!exam.equals(other.exam))
			return false;
		if (mcqAnswerId != other.mcqAnswerId)
			return false;
		if (mcqChoice == null) {
			if (other.mcqChoice != null)
				return false;
		} else if (!mcqChoice.equals(other.mcqChoice))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}
	
	
}
