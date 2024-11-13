package java16;

import java.util.Arrays;

public class StudentCRUD {
    private Student[] databaseStudents = new Student[0];
    private int size = 0;


    public String add(Student newStudent) {
        databaseStudents = Arrays.copyOf(databaseStudents, size + 1);
        databaseStudents[size] = newStudent;
        size++;
        return "Successfully saved student!";
    }

    public String add(Student[] newStudents) {
        for (Student newStudent : newStudents) {
            add(newStudent);
        }
        return "Successfully saved students!";
    }

    public Student[] getAll() {
        return databaseStudents;
    }

    public Student findById(long id) {
        for (Student student : databaseStudents) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public String update(long id, Student newStudent) {
        for (Student student : databaseStudents) {
            if (student.getId() == id) {
                student.setName(newStudent.getName());
                student.setGender(newStudent.getGender());
                student.setAge(newStudent.getAge());
                return "Student with id: " + id + " successfully updated!";
            }
        }
        return "Student with id: " + id + " not found";
    }

    //  12              //0       // 1             2.          3.   // size = 4
    public String deleteById(long id) {        // 10 Ernis   11 Nursultan  13 Baiel    null
        boolean foundStudent = false;
        for (int i = 0; i < size; i++) {
            if (databaseStudents[i].getId() == id) {
                foundStudent = true;
                for (int j = i; j < size - 1; j++) {
                    databaseStudents[j] = databaseStudents[j + 1];
                }
                size--;
            }
        }
        databaseStudents = Arrays.copyOf(databaseStudents, databaseStudents.length - 1);
        return foundStudent ? "Successfully deleted" : "Student with id: " + id + " not found!";
    }

}
