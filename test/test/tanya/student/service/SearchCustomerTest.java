package test.tanya.student.service;

import klasevich.tanya.customer.entity.Customer;
import klasevich.tanya.customer.entity.CustomerBase;
import klasevich.tanya.customer.service.SearchCustomer;
import klasevich.tanya.student.entity.Student;
import klasevich.tanya.student.entity.StudentBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class SearchCustomerTest {
    SearchCustomer searchCustomer;
    CustomerBase base;

    @BeforeClass
    public void SetUP() {
        searchCustomer = new SearchCustomer();
        base = new CustomerBase();

        base.addCustomer(new Customer(1, "Klasevich", "Oleh", "Igorevich",
                "Polevaya str.,24", 235678, 256));
        base.addCustomer(new Customer(2, "Ignatenko", "Boris", "Fedorovich",
                "Krasnaya str.,15", 237878, 143));
        base.addCustomer(new Customer(3, "Petrenko", "Larisa", "Mihaylovna",
                "Masherova str.,118", 231345, 117));
        base.addCustomer(new Customer(4, "Urbanovich", "Gleb", "Sergeevich",
                "Krasnoznamennaya str.,7", 238978, 256));
        base.addCustomer(new Customer(5, "Andreenko", "Tatsiana", "Vladzimirovna",
                "Inogorodnyaya str.,245", 235614, 117));
    }

    @Test
    public void testSearchByCreditNumber() {
        int firstNumber = 235000;
        int lastNumber = 238000;

        CustomerBase actual = searchCustomer.searchByCreditNumber(firstNumber, lastNumber, base);
        List<Customer> list = actual.getBase();

        boolean isSuitableCreditNumber = true;
        for (Customer s : list) {
            if (s.getCreditNum() < firstNumber || s.getCreditNum() > lastNumber) {
                isSuitableCreditNumber = false;
                break;
            }
        }
        assertTrue(isSuitableCreditNumber);
    }
}
