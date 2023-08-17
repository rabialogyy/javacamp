import business.CategoryManager;
import business.ICourseService;
import business.ITeacherService;
import business.ICategoryService;
import business.CourseManager;
import business.TeacherService;
import database.HibernateDao;
import database.ProductDao;
import database.JDBCDao;
import entities.Course;
import entities.Teacher;
import entities.Category;
import loggers.DatabaseLogger;
import loggers.FileLogger;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        ICategoryService categoryService = new CategoryManager(new JDBCDao());
        ITeacherService teacherService = new TeacherService(new JDBCDao());
        ICourseService courseService = new CourseManager(new JDBCDao());

        Category category = new Category();
        category.setId(1);
        category.setCategoryName("programlama");

        Teacher teacher = new Teacher();
        teacher.setName("engin");
        teacher.setName("ENES ");

        Course course = new Course();
        course.setCourseName("java yazılım yetiştirme kampı ");
        course.setCourseName("Senior Yazılım Geliştirici Yetiştirme Kampı");
        course.setUnitPrice(0);

        teacherService.add(teacher);
        courseService.add(course);
        categoryService.add(category);

        DatabaseLogger databaseLogger=new DatabaseLogger();
        databaseLogger.add(category,course,teacher);


    }
}