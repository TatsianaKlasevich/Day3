package klasevich.tanya.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerBase {

    private List<Customer> base;

    public CustomerBase(List<Customer> base) {
        this.base = base;
    }

    public CustomerBase() {
        this.base = new ArrayList<Customer>();
    }

    public List<Customer> getBase() {
        return base;
    }

    public void setBase(List<Customer> base) {
        this.base = base;
    }

    public void addCustomer(Customer customer) {
        base.add(customer);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerBase{");
        sb.append("base=").append(base);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerBase that = (CustomerBase) o;

        return getBase() != null ? getBase().equals(that.getBase()) : that.getBase() == null;
    }

    @Override
    public int hashCode() {
        return getBase() != null ? getBase().hashCode() : 0;
    }
}
