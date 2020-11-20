package klasevich.tanya.student.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentBase {
    private List<Student> base;

    public StudentBase(List<Student> base) {
        this.base = base;
    }

    public StudentBase() {
        this.base = new ArrayList<Student>();
    }

    public List<Student> getBase() {
        return base;
    }

    public void setBase(List<Student> base) {
        this.base = base;
    }

    public void addStudent(Student student) {
        base.add(student);
    }

    public void removeStudent(Student student) {
        base.remove(student);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentBase{");
        sb.append("base=").append(base);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentBase that = (StudentBase) o;

        return getBase() != null ? getBase().equals(that.getBase()) : that.getBase() == null;
    }

    @Override
    public int hashCode() {
        return getBase() != null ? getBase().hashCode() : 0;
    }
}
