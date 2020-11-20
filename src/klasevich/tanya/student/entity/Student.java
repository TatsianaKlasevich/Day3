package klasevich.tanya.student.entity;

import java.time.LocalDate;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate dateOfBirthday;
    private String address;
    private long phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student() {

    }

    public Student(int id, String surname, String name, LocalDate dateOfBirthday, long phoneNumber, String faculty, int course) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
    }

    public Student(int id, String surname, String name, String patronymic, LocalDate dateOfBirthday, String address, long phoneNumber, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirthday = dateOfBirthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
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

    public void setSurname(String surname) {
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

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", patronymic='").append(patronymic).append('\'');
        sb.append(", dateOfBirthday='").append(dateOfBirthday).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", faculty='").append(faculty).append('\'');
        sb.append(", course=").append(course);
        sb.append(", group='").append(group).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getId() != student.getId()) return false;
        if (getPhoneNumber() != student.getPhoneNumber()) return false;
        if (getCourse() != student.getCourse()) return false;
        if (getSurname() != null ? !getSurname().equals(student.getSurname()) : student.getSurname() != null)
            return false;
        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        if (getPatronymic() != null ? !getPatronymic().equals(student.getPatronymic()) : student.getPatronymic() != null)
            return false;
        if (getDateOfBirthday() != null ? !getDateOfBirthday().equals(student.getDateOfBirthday()) : student.getDateOfBirthday() != null)
            return false;
        if (getAddress() != null ? !getAddress().equals(student.getAddress()) : student.getAddress() != null)
            return false;
        if (getFaculty() != null ? !getFaculty().equals(student.getFaculty()) : student.getFaculty() != null)
            return false;
        return getGroup() != null ? getGroup().equals(student.getGroup()) : student.getGroup() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPatronymic() != null ? getPatronymic().hashCode() : 0);
        result = 31 * result + (getDateOfBirthday() != null ? getDateOfBirthday().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (int) (getPhoneNumber() ^ (getPhoneNumber() >>> 32));
        result = 31 * result + (getFaculty() != null ? getFaculty().hashCode() : 0);
        result = 31 * result + getCourse();
        result = 31 * result + (getGroup() != null ? getGroup().hashCode() : 0);
        return result;
    }
}
