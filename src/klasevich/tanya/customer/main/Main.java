package klasevich.tanya.customer.main;

import klasevich.tanya.customer.entity.Customer;
import klasevich.tanya.customer.entity.CustomerBase;
import klasevich.tanya.customer.service.SearchCustomer;
import klasevich.tanya.customer.service.SortCustomer;
import klasevich.tanya.customer.view.CustomerView;
import klasevich.tanya.student.Service.SearchStudent;

public class Main {
    public static void main(String[] args) {

        CustomerBase base = new CustomerBase();

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

        SortCustomer base1 = new SortCustomer();
        SearchCustomer base2 = new SearchCustomer();

        CustomerBase sortBySurname = base1.sortBySurname(base);
        CustomerBase creditCardBase = base2.searchByCreditNumber(235000, 238000, base);

        CustomerView view = new CustomerView();

        view.print(sortBySurname);
        view.print(creditCardBase);
    }
}
