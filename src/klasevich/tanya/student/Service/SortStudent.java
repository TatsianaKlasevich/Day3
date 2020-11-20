package klasevich.tanya.student.Service;

import klasevich.tanya.student.entity.Student;
import klasevich.tanya.student.entity.StudentBase;

import java.util.List;

public class SortStudent {
    public StudentBase faculty(StudentBase base) {
        List<Student> list = base.getBase();
        StudentBase baseNew = new StudentBase();

        for (int j = 0; j < list.size(); j++) {
            for (int i = j + 1; i < list.size(); i++) {
                if (list.get(i).getFaculty()
                        .compareTo(list.get(j).getFaculty()) < 0) {
                    Student temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        baseNew.setBase(list);
        return baseNew;
    }

    public StudentBase course(StudentBase base) {
        List<Student> list = base.getBase();
        StudentBase baseNew = new StudentBase();

        for (int j = 0; j < list.size(); j++) {
            for (int i = j + 1; i < list.size(); i++) {
                if (list.get(i).getCourse() == list.get(j).getCourse()) {
                    Student temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);

                }
            }
        }
        baseNew.setBase(list);
        return baseNew;
    }
}
