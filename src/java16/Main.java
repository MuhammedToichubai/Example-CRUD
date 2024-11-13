package java16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static StudentCRUD studentCRUD = new StudentCRUD();
    static Scanner scannerNumber = new Scanner(System.in);
    static Scanner scannerForLine = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            showCommands();
            String command = scannerForLine.nextLine();
            switch (command.toLowerCase()) {
                case "0", "end" -> {
                    return;
                }
                case "1", "add" -> {
                    Student student = setupStudentInfo(new Student());
                    String result = studentCRUD.add(student);
                    System.out.println(result);
                }
                case "2", "addAll" -> {
                    System.out.print("Write amount students: ");
                    var amountStudents = scannerNumber.nextInt();

                    Student[] newStudentsArray = new Student[amountStudents];

                    for (int i = 0; i < newStudentsArray.length; i++) {
                        Student student = setupStudentInfo(new Student());
                        newStudentsArray[i] = student;
                    }
                    var result = studentCRUD.add(newStudentsArray);
                    System.out.println(result);
                }
                case "3", "getAll" -> {
                    Student[] allStudents = studentCRUD.getAll();
                    System.out.println(Arrays.toString(allStudents));
                }
                case "4", "update" -> {
                    System.out.print("To update student write student id: ");
                    var studentId = scannerNumber.nextInt();
                    Student byIdStudent = studentCRUD.findById(studentId);
                    if (byIdStudent != null) {
                        var result = studentCRUD.update(studentId, setupStudentInfo(new Student()));
                        System.out.println(result);
                    } else {
                        System.out.println("Student with id: "+studentId+" not found!");
                    }
                }
                case "5", "delete" ->{
                    System.out.print("To delete student write student id: ");
                    var studentId = scannerNumber.nextInt();
                    String result = studentCRUD.deleteById(studentId);
                    System.out.println(result);
                }

            }
        }
    }

    private static void showCommands() {
        System.out.println("""
                            Commands:
                Press to 1 or add:     Add new Student
                Press to 2 or addAll: Add new Students
                Press to 3 or getAll: Get All
                Press to 4 or update: Update student by id
                Press to 5 or delete: Delete by id
                Press to 0 or end: End the program
                """);
    }

    public static Student setupStudentInfo(Student student) {

        System.out.print("Write the student name: ");
        student.setName(scannerForLine.nextLine());

        System.out.print("Write the student gender: ");
        student.setGender(new Scanner(System.in).next().charAt(0));

        System.out.print("Write the student age: ");
        student.setAge(scannerNumber.nextInt());

        return student;

    }
}
