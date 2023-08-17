package database;

import entities.Category;
import entities.Course;
import entities.Teacher;

public class JDBCDao implements ProductDao{


    @Override
    public void add(Teacher teacher) {
        System.out.println("Added to database with JDBC :"+teacher.getName());
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Removed to database with JDBC:"+teacher.getName());

    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("Updated to database with JDBC:"+teacher.getName());

    }

    @Override
    public void add(Course course) {
        System.out.println("Added to database with JDBC:"+course.getCourseName());

    }

    @Override
    public void delete(Course course) {
        System.out.println("Removed to database with JDBC:"+course.getCourseName());

    }

    @Override
    public void update(Course course) {
        System.out.println("Updated to database with JDBC:"+course.getCourseName());

    }

    @Override
    public void add(Category category) {
        System.out.println("Added to database with JDBC:"+category.getCategoryName());

    }

    @Override
    public void delete(Category category) {
        System.out.println("Removed to database with JDBC:"+category.getCategoryName());

    }

    @Override
    public void update(Category category) {
        System.out.println("Removed to database with JDBC:"+ category.getCategoryName());

    }
}
