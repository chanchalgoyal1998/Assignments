package com.yash.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
@Entity
public class StudentTestAttempt {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staid;
	@OneToOne
	@JoinColumn(name="studentid")
	private Student student;
	@OneToOne
	@JoinColumn(name="qid")
	private TestQuestions question;
	private int markedAnswer;
	public int getStaid() {
		return staid;
	}
	public void setStaid(int staid) {
		this.staid = staid;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public TestQuestions getQuestion() {
		return question;
	}
	public void setQuestion(TestQuestions question) {
		this.question = question;
	}
	public int getMarkedAnswer() {
		return markedAnswer;
	}
	public void setMarkedAnswer(int markedAnswer) {
		this.markedAnswer = markedAnswer;
	}

	public StudentTestAttempt() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentTestAttempt [staid=" + staid + ", student=" + student + ", question=" + question
				+ ", markedAnswer=" + markedAnswer + "]";
	}
	public StudentTestAttempt(int staid, Student student, TestQuestions question, int markedAnswer) {
		super();
		this.staid = staid;
		this.student = student;
		this.question = question;
		this.markedAnswer = markedAnswer;
	}
	
	
}
