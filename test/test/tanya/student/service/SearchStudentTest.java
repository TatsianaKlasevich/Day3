package test.tanya.student.service;

import klasevich.tanya.student.Service.SearchStudent;
import klasevich.tanya.student.entity.Student;
import klasevich.tanya.student.entity.StudentBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.List;

import static org.testng.Assert.*;

public class SearchStudentTest {
    SearchStudent searchStudent;
    StudentBase base;

    @BeforeClass
    public void setUp() {
        searchStudent = new SearchStudent();
        base = new StudentBase();
        base.addStudent(new Student(1, "Egorov", "Oleg", "Vasiljevich",
                LocalDate.of(1998, 10, 20), "Sovetskaya str. 56", 297498336,
                "FM", 4, "A"));
        base.addStudent(new Student(2, "Hvastovv", "Vladimir", "Vladimirovich",
                LocalDate.of(2002, 5, 25), "Svetskaya str. 56", 339446346,
                "AM", 1, "D"));
        base.addStudent(new Student(3, "Korzun", "Natalia", "Petrovna",
                LocalDate.of(1998, 3, 17), "Sovetskaya str. 56", 332498448,
                "FM", 4, "A"));
        base.addStudent(new Student(4, "Golovach", "Andrey", "Egorovich",
                LocalDate.of(1999, 8, 4), "Sovetskaya str. 56", 253547843,
                "FM", 4, "A"));
        base.addStudent(new Student(5, "Semenova", "Antonina", "Pavlovna",
                LocalDate.of(1998, 1, 1), "Sovetskaya str. 56", 339267372,
                "TM", 5, "B"));
        base.addStudent(new Student(6, "Andreevskiy", "Roman", "Vasiljevich",
                LocalDate.of(2000, 7, 3), "Sovetskaya str. 56", 295358371,
                "DM", 2, "A"));
        base.addStudent(new Student(7, "Skoryh", "Anna", "Genadjevna",
                LocalDate.of(1998, 6, 7), "Sovetskaya str. 56", 338328844,
                "FM", 4, "A"));
        base.addStudent(new Student(8, "Golubko", "Marina", "Haritonovna",
                LocalDate.of(2002, 5, 26), "Sovetskaya str. 56", 259478021,
                "AM", 1, "D"));
    }

    @Test
    public void testSearchFaculty() {
        String faculty = "FM";

        StudentBase actual = searchStudent.searchFaculty(base, faculty);
        List<Student> list = actual.getBase();

        boolean isSuitableFaculty = true;
        for (Student s : list) {
            if (!s.getFaculty().equals(faculty)) {
                isSuitableFaculty = false;
                break;
            }
        }
        assertTrue(isSuitableFaculty);
    }


    @Test
    public void testSearchYear() {
        int year = 2000;

        StudentBase actual = searchStudent.searchYear(base, year);
        List<Student> list = actual.getBase();

        boolean isSuitableYear = true;
        for (Student s : list) {
            if (s.getDateOfBirthday().getYear() < year) {
                isSuitableYear = false;
                break;
            }
        }
        assertTrue(isSuitableYear);
    }

    @Test
    public void testSearchGroup() {
        String group = "A";

        StudentBase actual = searchStudent.searchGroup(base, group);
        List<Student> list = actual.getBase();

        boolean isSuitableGroup = true;
        for (Student s : list) {
            if (!s.getGroup().equals(group)) {
                isSuitableGroup = false;
                break;
            }
        }
        assertTrue(isSuitableGroup);
    }
}
