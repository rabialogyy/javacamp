package database;

import entities.Category;
import entities.Course;
import entities.Teacher;

public class HibernateDao implements ProductDao {    // product dao ile implement edildi metotlar otomatik geldi
    @Override
    public void add(Teacher teacher) {
        System.out.println("Added to database with Hibernate :"+teacher.getName());
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Removed to database with Hibernate :"+teacher.getName());

    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("Updated to database with Hibernate :"+teacher.getName());

    }

    @Override
    public void add(Course course) {
        System.out.println("Added to database with Hibernate :"+course.getCourseName());

    }

    @Override
    public void delete(Course course) {
        System.out.println("Removed to database with Hibernate :"+course.getCourseName());

    }

    @Override
    public void update(Course course) {
        System.out.println("Updated to database with Hibernate :"+course.getCourseName());

    }

    @Override
    public void add(Category category) {
        System.out.println("Added to database with Hibernate :"+category.getCategoryName());

    }

    @Override
    public void delete(Category category) {
        System.out.println("Removed to database with Hibernate :"+category.getCategoryName());

    }

    @Override
    public void update(Category category) {
        System.out.println("Removed to database with Hibernate :"+ category.getCategoryName());

    }

}


