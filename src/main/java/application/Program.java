package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Teste N° 1: Seller findById");
        Seller seller = sellerDao.findById(3);

        System.out.println("Teste N° 2: Seller findByDeparment");

        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list){
            System.out.println(obj);
        }

        /*System.out.println("Teste N° 4: Seller insert");

        Seller newSeller = new Seller(null, "Diego", "contato@diegochruscinski.com.br", new Date(), 1.750, department);
        sellerDao.insert(newSeller);

        System.out.println("Inserted! New id = "+ newSeller.getId());*/


        System.out.println("\nTeste nº 5: Seller update");
        seller = sellerDao.findById(1);
        seller.setName("FNAF is coming");
        sellerDao.update(seller);
        System.out.println("Update completed");

    }
}
