package business;

import entities.Course;
import database.ProductDao;

public class CourseManager implements ICourseService {
    private ProductDao productDao;

    public CourseManager(ProductDao productDao) {
        this.productDao = productDao;

    }

    @Override
    public void add(Course course) {
        if ("JAVACAMP" == course.getCourseName()) {
            System.out.println("Same category name is not repeated");
        } else if (course.getUnitPrice() <= 0) {
            System.out.println("Course price must be over 0");

        } else {
            productDao.add(course);
        }


    }

    @Override
    public void delete(Course course) {
        productDao.delete(course);

    }

    @Override
    public void update(Course course) {
        productDao.update(course);

    }
}
