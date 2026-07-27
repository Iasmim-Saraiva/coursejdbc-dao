package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById =====");
        Department department = departmentDao.findById(6);
        System.out.println(department);

        System.out.println("=== TEST 2: department findAll =====");
        List<Department> list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 3: department update =====");
        department = departmentDao.findById(6);
        department.setName("Jewelry");
        departmentDao.update(department);
        System.out.println("Update completed!");
    }
}
