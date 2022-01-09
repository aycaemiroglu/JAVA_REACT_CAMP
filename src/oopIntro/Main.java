package oopIntro;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"lenovo v14",15000,"16 gb ram",10);
        Product product2 = new Product();

        product2.setId(2);
        product2.setName("Lenovo 15");
        product2.setUnitPrice(16000);
        product2.setDetail("32 GB RAM");
        product2.setDiscount(10);

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("yiyecek");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("içecek");

        System.out.println(category1.getName());
        System.out.println(category2.getName());




    }
}
