package klasevich.tanya.customer.view;

import klasevich.tanya.customer.entity.Customer;
import klasevich.tanya.customer.entity.CustomerBase;

import java.util.List;

public class CustomerView {
    public void print(CustomerBase base) {
        List<Customer> list = base.getBase();

        for (Customer person : list) {
            System.out.println("id=" + person.getId() + ", surname=" + person.getSurname() + ", name="
                    + person.getName() + ", patronymic=" + person.getPatronymic() + ", address=" + person.getAddress()
                    + ", creditNum=" + person.getCreditNum() + ", bankAccount=" + person.getBankAccount());

        }
        System.out.println("-------------------------------------------");
    }
}
