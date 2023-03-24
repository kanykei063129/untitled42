package service.impl;

import db.Database;
import enums.Gender;
import exceptions.MyException;
import model.Group;
import model.Student;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    List<Student> students = new ArrayList<>();
    List<Group> groups = new ArrayList<>();
    Database database = new Database();

    @Override
    public String addStudent(Student student) {
//        int counter = 0;
//      Student student1 = new Student();
//        boolean isTrue = true;
//        while (isTrue) {
//            try {
//                System.out.print("Enter student name: ");
//                String name = new Scanner(System.in).nextLine();
//                System.out.println("Enter group age: ");
//                int age = new Scanner(System.in).nextInt();
//                System.out.println("Enter student gender: ");
//                String a = new Scanner(System.in).nextLine();
//                if (a.equalsIgnoreCase("male")) {
//                student.setGender(Gender.MALE);
//                isTure = false;
//                } else if (a.equalsIgnoreCase("female")) {
//                student.setGender(Gender.FEMALE);
//                isTure = false;
//                } else {
//                System.out.println("No gender!!!");
//                isTure = true;
//                student1.setFullName(name);
//                student1.setAge(age);
//                if (!groups.isEmpty()) {
//                    for (Group g : groups) {
//                        if (g.getName().equalsIgnoreCase(name)) {
//                            isTrue = false;
//                            student1.setId(++counter);
//                            groups.add(g);
//                            throw new MyException("Same group name!");
//                        } else {
//                            student1.setId(++counter);
//                            students.add(student1);
//                            isTrue = false;
//                            return student1;
//                        }
//                    }
//                } else {
//                    student1.setId(++counter);
//                    student1.setFullName(name);
//                    student1.setAge(age);
//                    students.add(student1);
//                    isTrue = false;
//                }
//            } catch (MyException e) {
//                System.out.println(e.getMessage());
//            }
//        }

            database.getStudents().add(student);
            return "";
        }

    @Override
    public Student getStudentById(int id) {
        students.stream().filter(x -> x.getId() ==2 ).forEach(System.out::println);
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        students.stream().map(Student::toString).forEach(System.out::println);
        return students;
    }

    @Override
    public String updateStudentFullName(int id, String fullName) {
        return null;
    }

    @Override
    public List<Student> filterByGender() {
        List<Student>boys = students.stream().filter(s -> s.getGender().equals(Gender.MALE)).toList();
        List<Student> girls = students.stream().filter(s -> s.getGender().equals(Gender.FEMALE)).toList();
        System.out.println("boys\n"+boys);
        System.out.println("gris\n"+girls);
        return null;
    }

    @Override
    public void deleteStudentById(int id) {
    }
}