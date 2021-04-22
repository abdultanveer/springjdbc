package basic;

import basic.dao.StudentDao;
import basic.dao.StudentDaoImpl;
import basic.model.Student;

public class PlayJdbc {
	public static void main(String[] args) {
		Student myStudent = new Student(3, "akshay", 5, 66);
		Student anotherStudent = new Student(4,"gayathri",6,88);
		StudentDao studentDao = new StudentDaoImpl();
		studentDao.insert(anotherStudent);
	}

}
