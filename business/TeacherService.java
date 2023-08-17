package business;

import entities.Teacher;
import database.ProductDao;

public class TeacherService implements ITeacherService{
   private  ProductDao productDao;
   public TeacherService (ProductDao productDao){
       this.productDao=productDao;
   }

    @Override
    public void add(Teacher teacher) {
       productDao.add(teacher);


    }

    @Override
    public void delete(Teacher teacher) {
       productDao.delete(teacher);

    }

    @Override
    public void update(Teacher teacher) {
    productDao.update(teacher);
    }
}
