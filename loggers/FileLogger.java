package loggers;
import entities.Teacher;
import entities.Course;
import entities.Category;

public class FileLogger implements ILoggerDao {

    @Override
    public void add(Category category, Course course, Teacher teacher) {
        System.out.println("Logged in with File:"+ course.getCourseName());
    }
}
