package basic.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import basic.model.Student;

public class StudentDaoImpl  implements StudentDao{
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


	
}
