package loggers;

import entities.Category;
import entities.Course;
import entities.Teacher;

public class DatabaseLogger implements ILoggerDao{
    @Override
    public void add(Category category, Course course, Teacher teacher) {
        System.out.println("Logged in with Database:"+course.getCourseName());
    }
}
