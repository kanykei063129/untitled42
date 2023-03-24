import enums.Gender;
import model.Group;
import model.Student;
import service.impl.GroupServiceImpl;
import service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        GroupServiceImpl groupService = new GroupServiceImpl();
        System.out.println(groupService.getAllGroups());

        Student student = new Student(1,"Kanykei",17, Gender.FEMALE);
        Student student1 = new Student(2,"Madina",16,Gender.FEMALE);
        Student student2 = new Student(3,"Davran",18,Gender.MALE);
        List<Student>students = new ArrayList<>();

        Group group = new Group(1,"Java","Java-9",2012);
        Group group1 = new Group(2,"Js","Js-9",2015);
        Group group2 = new Group(3,"Laptop","Laptop super",2018);

        studentService.addStudent((Student) students);
        studentService.getStudentById(1);
        studentService.getAllStudents();
        studentService.updateStudentFullName(2,"Madina");
        studentService.filterByGender();
        studentService.deleteStudentById(3);

        groupService.addNewGroup(group);
        groupService.getGroupById(3);
        groupService.getAllGroups();
        groupService.updateGroupName(1,"Java");
        groupService.filterByYear(2012,"ascDesc");
        groupService.sortGroupByYear("sxc");
        groupService.deleteGroupById(2);

    }
}