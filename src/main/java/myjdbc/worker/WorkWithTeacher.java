package myjdbc.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import myjdbc.data.dao.TeachersDao;
import myjdbc.data.entity.Teacher;

@Transactional
public class WorkWithTeacher {
    @Autowired
    private TeachersDao teachersDao;
    public Teacher addTeacher(Teacher teacher){
        teachersDao.addTeacher(teacher);
        System.out.println("Teacher has been added "+teacher);
        return teacher;
    }
    public Teacher getTeacherById(int id){
        return teachersDao.getTeacherById(id);
    }
    public void saveTeacher(Teacher teacher){
        teachersDao.saveTeacher(teacher);
        System.out.println("Teacher has been saved "+teacher);
    }
}
