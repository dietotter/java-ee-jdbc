package myjdbc.data.dao;

import myjdbc.data.entity.Teacher;

public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
}