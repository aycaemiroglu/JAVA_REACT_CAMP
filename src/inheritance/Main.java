package inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer ayca = new IndividualCustomer();
        ayca.customerNumber = "111111";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "222222";

        CustomerManager customerManager = new CustomerManager();
        Customer[] customers = {hepsiBurada,ayca};
        customerManager.addMultiple(customers);


    }

}
