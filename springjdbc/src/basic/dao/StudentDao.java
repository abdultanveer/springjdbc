package basic.dao;

import basic.model.Student;

public interface StudentDao {
	 void insert(Student student);
	 void delRecordById(int id);
	 int delRecordByNameORSem(String studentName, int sem);

}
