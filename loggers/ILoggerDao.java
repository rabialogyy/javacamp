package loggers;
import entities.Course;
import entities.Category;
import entities.Teacher;

public interface ILoggerDao {
    public void add(Category category,Course course,Teacher teacher);



}
