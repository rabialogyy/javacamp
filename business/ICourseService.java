package business;

import entities.Course;  // course sınıf ile import edilmiştir

public interface ICourseService {
    void add(Course course);

    void delete(Course course);

    void update(Course course);
}
