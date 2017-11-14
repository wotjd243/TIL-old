import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice1 {

	public static void main(String[] args) {
		List<Student> studentList = getStudentList();
		whoHasHighScore(studentList);
	}

	static void whoHasHighScore(List<Student> studentList) {
		Student highScoreStudent = new Student(0, "", 0);
		for (Student student : studentList) {
			if (student.getScore() > highScoreStudent.getScore()) {
				highScoreStudent = student;
			}
		}
		System.out.println(highScoreStudent);
	}

	static List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "Jason", 100));
		studentList.add(new Student(2, "Justin", 80));
		studentList.add(new Student(3, "John", 95));

		return studentList;
	}

	@Data
	@AllArgsConstructor
	static class Student {
		private int id;
		private String name;
		private int score;
	}
}
