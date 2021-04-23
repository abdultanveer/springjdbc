package basic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import basic.model.Student;

public class StudentResultSetExtractor implements ResultSetExtractor<List<Student>> {

	@Override
	public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
		System.out.println("extractData method called");
		List<Student> students = new ArrayList<>();
		while(rs.next()) {
			Student student = new Student();
			student.setId(rs.getInt("_id"));
			student.setName(rs.getString("name"));
			student.setSem(rs.getInt("semester"));
			student.setAverage(rs.getInt("average"));
			students.add(student);
		}
		
		return students;
	}

}
