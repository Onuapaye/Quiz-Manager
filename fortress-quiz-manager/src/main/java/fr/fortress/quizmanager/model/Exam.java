package fr.fortress.quizmanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Exam", schema = "FORTRESSSCHEMA")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="examId")
	private int examId;

	@Column(name="examTitle", length = 255, nullable = false)
	String examTitleName;

	public Exam() {
		
	}
	
	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getExamTitleName() {
		return examTitleName;
	}

	public void setExamTitleName(String examTitleName) {
		this.examTitleName = examTitleName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + examId;
		result = prime * result + ((examTitleName == null) ? 0 : examTitleName.hashCode());
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
		Exam other = (Exam) obj;
		if (examId != other.examId)
			return false;
		if (examTitleName == null) {
			if (other.examTitleName != null)
				return false;
		} else if (!examTitleName.equals(other.examTitleName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examTitleName=" + examTitleName + "]";
	}
	
	
}
