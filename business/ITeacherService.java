package business;

import entities.Teacher;   // teacher sınıfı ile import edilmiştir


public interface ITeacherService {
    void add(Teacher teacher);

    void delete(Teacher teacher);

    void update(Teacher teacher);
}
