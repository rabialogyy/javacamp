package business;

import entities.Category;
import database.ProductDao;

public class CategoryManager implements ICategoryService {   // implement edildi managerda erişi sağlanması için

    private ProductDao productDao; // sadece bu projede kullanıldığı için private alındı

    public CategoryManager(ProductDao productDao) {// categorymanager sınıfına erişim için productdao atandı.

        this.productDao = productDao;
    }


    @Override
    public void add(Category category) {
        if ("Java" == category.getCategoryName()) {  // kategori adı tekrar edemez
            System.out.println("Same  category category name is not repeated");
        } else {
            productDao.add(category);
        }


    }

    @Override
    public void delete(Category category) {
        productDao.delete(category);

    }

    @Override
    public void update(Category category) {
        productDao.update(category);

    }
}
