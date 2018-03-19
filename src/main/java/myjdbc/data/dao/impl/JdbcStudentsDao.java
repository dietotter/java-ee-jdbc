package myjdbc.data.dao.impl;

import myjdbc.data.dao.StudentsDao;
import myjdbc.data.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcStudentsDao implements StudentsDao{

    private static final String SQL_INSERT_STUDENT = "insert into students (pib,course) values (?,?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        jdbcTemplate.update(SQL_INSERT_STUDENT,
                student.getPib(),
                student.getCourse());
    }
}
