package basic.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import basic.model.Student;

@Repository("studentDao")
public class StudentDaoImpl  implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




	@Override
	public void insert(Student student) {
		//INSERT INTO `student` (`_id`, `name`, `semester`, `average`) 
		//VALUES ('9', 'yahas', '2', '67');
		String sql = "INSERT INTO student VALUES (?,?,?,?)";
		Object[] objects =	{student.getId(),student.getName(),student.getSem(),student.getAverage()};

		int no_rows_inserted =	jdbcTemplate.update(sql,objects);
		System.out.println("no of rows inserted  is"+ no_rows_inserted);
	}




	@Override
	public void delRecordById(int id) {
		String delSql = "DELETE FROM STUDENT WHERE _id = ?";
		int noRecordsDeleted = jdbcTemplate.update(delSql,id);
		System.out.println("no of records deleted = "+ noRecordsDeleted);
	}




	@Override
	public int delRecordByNameSem(String studentName, int sem) {
		String sql = "DELETE FROM STUDENT WHERE NAME = ? OR SEMESTER = ?"; //replace OR with AND and see the results
		Object[] objects = {studentName,sem};
		int noRecordsDeleted = jdbcTemplate.update(sql, objects);
		System.out.println("no of records deleted ="+ noRecordsDeleted);
		return noRecordsDeleted;
	}


	
}
