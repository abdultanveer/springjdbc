package basic;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.dao.StudentDao;
import basic.dao.StudentDaoImpl;
import basic.model.Student;

public class PlayJdbc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*
		 * StudentDaoHelper helper =
		 * context.getBean("studentDaoHelper",StudentDaoHelper.class);
		 * helper.insertStudents();
		 */
		
		StudentDaoImpl studentDao = (StudentDaoImpl) context.getBean("studentDao");
		
		System.out.println(studentDao.findStudentById(3));
		/*
		 * List<Student> students = studentDao.getAllStudents();
		 * printStudents(students);
		 */
		
		//studentDao.delRecordById(13);
		
		//insertStudent(studentDao);
		//studentDao.cleanUp();
		//studentDao.delRecordByNameORSem("ansari", 5);
	}

	
	
	
	private static void printStudents(List<Student> students) {
			for(Student s : students) {
				System.out.println(s);
			}
	}




	private static void insertStudent(StudentDao studentDao) {
		Student myStudent = new Student(5, "bapji", 5, 55);
		Student anotherStudent = new Student(6,"chandra",6,66);
		//= new StudentDaoImpl();
		studentDao.insert(myStudent);
	}

}
