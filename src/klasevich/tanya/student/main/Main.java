package klasevich.tanya.student.main;

import klasevich.tanya.student.Service.SearchStudent;
import klasevich.tanya.student.Service.SortStudent;
import klasevich.tanya.student.entity.Student;
import klasevich.tanya.student.entity.StudentBase;
import klasevich.tanya.student.view.StudentView;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        StudentBase base = new StudentBase();

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

        SearchStudent searchStudent = new SearchStudent();
        StudentBase facultyGroup = searchStudent.searchFaculty(base, "FM");
        StudentBase searchYear = searchStudent.searchYear(base, 2000);
        StudentBase searchGroup = searchStudent.searchGroup(base, "A");

        SortStudent sort = new SortStudent();
        StudentBase sortByfacultyGroup = sort.faculty(base);
        StudentBase sortByCourseGroup = sort.course(base);


        StudentView view = new StudentView();
        view.print(facultyGroup);
        view.print(sortByfacultyGroup);
        view.print(sortByCourseGroup);
        view.print(searchYear);
        view.print(searchGroup);
    }
}
