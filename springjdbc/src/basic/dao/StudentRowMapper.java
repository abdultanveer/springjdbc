package basic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import basic.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt("_id");
		String name = rs.getString("name");
		int sem = rs.getInt("semester");
		int avg = rs.getInt("average");
		Student newStudent = new Student(id,name,sem,avg);
		
		return newStudent;
	}



}
