package klasevich.tanya.customer.service;

import klasevich.tanya.customer.entity.Customer;
import klasevich.tanya.customer.entity.CustomerBase;

import java.util.ArrayList;
import java.util.List;

public class SearchCustomer {
    public CustomerBase searchByCreditNumber(int firstNumber, int lastNumber, CustomerBase base) {

        CustomerBase base2 = new CustomerBase();
        List<Customer> baseSortByCreditNumber = base.getBase();

        for (int j = 0; j < baseSortByCreditNumber.size(); j++) {
            if (baseSortByCreditNumber.get(j).getCreditNum() > firstNumber
                    && baseSortByCreditNumber.get(j).getCreditNum() < lastNumber) {
                base2.addCustomer(baseSortByCreditNumber.get(j));
            }
        }
        return base2;
    }
}