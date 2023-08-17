package business;

import entities.Category;  // category sınıfı import edilmiştir


public interface ICategoryService {    // eklenen metotları implement edilen sınıf zorunlu bi şekilde o metotları alır.
    void add(Category category);

    void delete(Category category);

    void update(Category category);

}
