package database;

import entities.Teacher;
import entities.Category;
import entities.Course;

public interface ProductDao {
    public void add(Teacher teacher);

    public void delete(Teacher teacher);

    public void update(Teacher teacher);


    public void add(Course course);

    public void delete(Course course);

    public void update(Course course);



    public void add(Category category);

    public void delete(Category category);

    public void update(Category category);


}
