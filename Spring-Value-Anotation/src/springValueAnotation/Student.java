package springValueAnotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	public Student() {
		System.out.println("Student object is created");
	}
	@Value("${student.studentId}")
	private int studentId;
	private String studentName;
	private String skill;
	private String hobby;

	public Student(int studentId, String studentName, String skill, String hobby) {
		System.out.println("Student object is created");
		this.studentId = studentId;
		this.studentName = studentName;
		this.skill = skill;
		this.hobby = hobby;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Value("${student.studentName}")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Value("${student.skill}")
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student Id - "+studentId);
		System.out.println("Student Name - "+studentName);
		System.out.println("Student's Skill - "+skill);
		System.out.println("Student's Hobby - "+hobby);
	}
}
