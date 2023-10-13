package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Department department = new Department(1,"Mine");
        System.out.println(department);

        Seller seller = new Seller(21,"Diego", "diego@gmail.com", new Date(), 3000.0, department);

        SellerDao seller1 = DaoFactory.createSellerDao();
        System.out.println(seller);
        //
    }
}
