package service.impl;

import db.Database;
import model.Group;
import model.Student;
import service.GroupService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupServiceImpl implements GroupService {
    List<Group>groups = new ArrayList<>();
    List<Student>students = new ArrayList<>();
    Database database = new Database();
    @Override
    public String addNewGroup(Group group) {
//        int counter = 0;
//       Group group1 = new Group();
//        boolean isTrue = true;
//        while (isTrue) {
//            try {
//                System.out.print("Enter group name: ");
//                String name = new Scanner(System.in).nextLine();
//                System.out.println("Enter group description: ");
//                String description = new Scanner(System.in).nextLine();
//                System.out.println("Enter group year: ");
//                int a = new Scanner(System.in).nextInt();
//                group1.setName(name);
//                group1.setDescription(description);
//                group1.setYear(a);
//                if (!groups.isEmpty()) {
//                    for (Group g : groups) {
//                        if (g.getName().equalsIgnoreCase(name)) {
//                            isTrue = false;
//                            group1.setId(++counter);
//                            groups.add(g);
//                            throw new MyException("Same group name!");
//                        } else {
//                            group1.setId(++counter);
//                            groups.add(group1);
//                            isTrue = false;
//                            return group1;
//                        }
//                    }
//                } else {
//                    group1.setId(++counter);
//                    group1.setName(name);
//                    group1.setDescription(description);
//                    group1.setYear(a);
//                    groups.add(group1);
//                    isTrue = false;
//                }
//            } catch (MyException e) {
//                System.out.println(e.getMessage());
//            }
//        }
         database.getGroups().add(group);
         return "";
    }

    @Override
    public String getGroupById(int id) {
        groups.stream().filter(x -> x.getId() ==2 ).forEach(System.out::println);
        return null;
    }

    @Override
    public List<Group> getAllGroups() {
       groups.stream().map(Group::toString).forEach(System.out::println);
        return groups;
    }

    @Override
    public String updateGroupName(int id, String groupName) {
        return null;
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
            List<Group> groups = new ArrayList<>();
            groups.stream().sorted().collect(Collectors.toList());
                    groups.forEach(System.out::println);
            return groups;
    }
    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        List<Group> sortedList = new ArrayList<>();
        sortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        return null;
    }

    @Override
    public void deleteGroupById(int id) {
    }
}
