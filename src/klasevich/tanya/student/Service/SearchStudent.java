package klasevich.tanya.student.Service;

import klasevich.tanya.student.entity.Student;
import klasevich.tanya.student.entity.StudentBase;

import java.util.List;

public class SearchStudent {
    public StudentBase searchFaculty(StudentBase base, String faculty) {

        List<Student> list = base.getBase();
        StudentBase baseNew = new StudentBase();

        for (Student student : list) {
            if (student.getFaculty().equals(faculty)) {
                baseNew.addStudent(student);
            }
        }
        return baseNew;
    }

    public StudentBase searchYear(StudentBase base, int year) {
        List<Student> list = base.getBase();
        StudentBase baseNew = new StudentBase();

        for (Student student : list) {
            if (student.getDateOfBirthday().getYear() >= year) {
                baseNew.addStudent(student);
            }
        }
        return baseNew;
    }

    public StudentBase searchGroup(StudentBase base, String group) {
        List<Student> list = base.getBase();
        StudentBase baseNew = new StudentBase();

        for (Student student : list) {
            if (student.getGroup().equals(group)) {
                baseNew.addStudent(student);
            }
        }
        return baseNew;
    }
}