package klasevich.tanya.student.view;

import klasevich.tanya.student.entity.Student;
import klasevich.tanya.student.entity.StudentBase;

import java.util.List;

public class StudentView {
    public void print(StudentBase base) {
        List<Student> list = base.getBase();

        for (Student student : list) {
            System.out.println("ID - " + student.getId() + ", surname - " + student.getSurname() + ", name - " +
                    student.getName() + ", patronymic - " + student.getPatronymic() + ", date of birthday -  " +
                    student.getDateOfBirthday() + ", address - " + student.getAddress() + ", phone number - " +
                    student.getPhoneNumber() + ", faculty - " + student.getFaculty() + ", course - " +
                    student.getCourse() + ", group - " + student.getGroup());
        }

        System.out.println("-------------------------------------------");
    }
}
