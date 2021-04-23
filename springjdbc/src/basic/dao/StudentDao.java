package basic.dao;

import java.util.List;

import basic.model.Student;

public interface StudentDao {
	void insert(Student student);
	void insert(List<Student> students);
	void delRecordById(int id);
	int delRecordByNameORSem(String studentName, int sem);
	List<Student> getAllStudents();
	Student findStudentById(int id);


}
