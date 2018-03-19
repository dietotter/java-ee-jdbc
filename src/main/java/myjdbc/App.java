package myjdbc;

import myjdbc.data.entity.Student;
import myjdbc.data.entity.Teacher;
import myjdbc.worker.WorkWithStudents;
import myjdbc.worker.WorkWithTeacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        WorkWithStudents worker =
                (WorkWithStudents) context.getBean("worker");
                //new WorkWithStudents();
        Student testStudent = new Student("Serj Tankian", 2);
        worker.saveStudentToDb(testStudent);


        WorkWithTeacher workWithTeacher =
                (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        teacher.setBirthDate(new Date());
        workWithTeacher.saveTeacher(teacher);
    }
}
