package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.model.Course;
import com.cognizant.model.Student;

@Transactional
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	 private JdbcTemplate jdbcTemplate;
	

	@Override
    public List<Course> getAllCourses() {
        return jdbcTemplate.query(
                "select c.courseId,c.title,c.fees,c.description,c.trainer,c.start_date,count(s.studentId) from course c inner join student s on s.courseId=c.courseId group by c.courseId;",
                new RowMapper<Course>() {
                    Course c = null;

 

                    @Override
                    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
                        c = new Course(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getString(5),
                                rs.getDate(6),rs.getInt(7));
                        return c;
                    }
                });

 

    }
	
	

	
	@Override
	public int addStudent(Student student){    
	    String sql="insert into student (enrollmentId, studentId, courseId) values('"+student.getEnrollmentId()+"',"+student.getStudentId()+",'"+student.getCourseId()+"')";    
	    return jdbcTemplate.update(sql);    
	}   
	

	@Override
	public int deleteStudent(int studentId) {
		return jdbcTemplate.update("delete from student where studentId=?", new Object[] {
	            studentId
	        });
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Course getCourseById(int courseId) {

        String sql = " select c.courseId,c.title,c.fees,c.description,c.trainer,c.start_date,count(s.studentId) from course c inner join student s on s.courseId=c.courseId where c.courseId= ? group by c.courseId ";

        return jdbcTemplate.queryForObject(sql, new Object[]{courseId}, (rs, rowNum) ->
                new Course(
                		rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getString(5),
                        rs.getDate(6),rs.getInt(7)
                ));

    }

}
