package fr.fortress.quizmanager.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import fr.fortress.quizmanager.daos.ExamDAO;
import fr.fortress.quizmanager.model.Exam;

@Component
public class ExamService {

	@Inject
	ExamDAO examDAO;

	/*
	 * public boolean isUserAuthenticated(String examTitleName, int examId) {
	 * 
	 * Exam exam = new Exam(); exam.setExamTitleName(examTitleName);
	 * exam.setExamId(examId);
	 * 
	 * List<Exam> examList = examDAO.searchRecord(exam);
	 * 
	 * int count = examList.size(); boolean result = false;
	 * 
	 * for (int i = 0; i < count; i++) {
	 * 
	 * if (exam.getExamTitleName().equals(examList.get(i).getExamTitleName()) &&
	 * exam.getExamId() == examList.get(i).getExamId()) { result = true; } else {
	 * result = false; } } return result;
	 * 
	 * }
	 */

	public boolean createExam(Exam exam) {

		if (exam.getExamTitleName().equals(null)) {

			return false;
		} else {
			examDAO.createExam(exam);
			return true;
		}

	}

	public boolean updateExam(Exam exam) {

		if (exam.getExamTitleName().equals("") || exam.getExamId() <= 0) {

			return false;
		} else {
			examDAO.updateExam(exam);
			return true;
		}

	}

	public List<Exam> getAllExams(Exam exam) {

		List<Exam> examList = examDAO.getListOfAllExams(exam);
		return examList;
	}

	public List<Exam> getExamByExamTitleName(Exam exam) {
		List<Exam> examList = examDAO.getListOfExamByExamTitleName(exam);
		return examList;
	}

}
