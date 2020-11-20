package klasevich.tanya.customer.service;

import klasevich.tanya.customer.entity.Customer;
import klasevich.tanya.customer.entity.CustomerBase;

import java.util.List;

public class SortCustomer {
    public CustomerBase sortBySurname(CustomerBase base) {

        CustomerBase base1 = new CustomerBase();
        List<Customer> list = base.getBase();

        for (int j = 0; j < list.size(); j++) {
            for (int i = j + 1; i < list.size(); i++) {
                if (list.get(i).getSurname()
                        .compareToIgnoreCase(list.get(j).getSurname()) < 0) {
                    Customer temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);

                }
            }
        }
        base1.setBase(list);
        return base1;
    }
}
