package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.dao.StudentDao;
import basic.dao.StudentDaoImpl;
import basic.model.Student;

public class PlayJdbc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student myStudent = new Student(13, "bapji", 5, 66);
		Student anotherStudent = new Student(14,"chandra",6,88);
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		//= new StudentDaoImpl();
		studentDao.insert(myStudent);
	}

}
