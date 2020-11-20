package klasevich.tanya.customer.entity;

import java.util.Objects;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int creditNum;
    private int bankAccount;

    public Customer() {
    }

    public Customer(int id, String surname, String name, String patronymic, String address, int creditNum,
                    int bankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.creditNum = creditNum;
        this.bankAccount = bankAccount;
    }

    public Customer(int id, String surname, String name, int creditNum, int bankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.creditNum = creditNum;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String secondName) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String surname) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(int creditNum) {
        this.creditNum = creditNum;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", patronymic='").append(patronymic).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", creditNum=").append(creditNum);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (getId() != customer.getId()) return false;
        if (getCreditNum() != customer.getCreditNum()) return false;
        if (getBankAccount() != customer.getBankAccount()) return false;
        if (getSurname() != null ? !getSurname().equals(customer.getSurname()) : customer.getSurname() != null)
            return false;
        if (getName() != null ? !getName().equals(customer.getName()) : customer.getName() != null) return false;
        if (getPatronymic() != null ? !getPatronymic().equals(customer.getPatronymic()) : customer.getPatronymic() != null)
            return false;
        return getAddress() != null ? getAddress().equals(customer.getAddress()) : customer.getAddress() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPatronymic() != null ? getPatronymic().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + getCreditNum();
        result = 31 * result + getBankAccount();
        return result;
    }
}
