package basic.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import basic.model.Student;

public class StudentDaoImpl  implements StudentDao{
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());


	@Override
	public void insert(Student student) {
		//INSERT INTO `student` (`_id`, `name`, `semester`, `average`) 
		//VALUES ('9', 'yahas', '2', '67');
		String sql = "INSERT INTO student VALUES (?,?,?,?)";
		Object[] objects =	{student.getId(),student.getName(),student.getSem(),student.getAverage()};

		int no_rows_inserted =	jdbcTemplate.update(sql,objects);
		System.out.println("no of rows inserted  is"+ no_rows_inserted);
	}


	public DataSource getDataSource() {
		String url = "jdbc:mysql://127.0.0.1:3306/spring_jdbc";
		String username = "root";
		String password ="";

		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
		return dataSource;
	}

}
