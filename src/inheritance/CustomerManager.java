package inheritance;

public class CustomerManager {
    public void add(IndividualCustomer customer){
        System.out.println(customer);
    }
    public void add(CorporateCustomer customer){
        System.out.println();
    }
}
