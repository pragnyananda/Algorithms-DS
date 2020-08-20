package com.pnm.javaExamples;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Student {
    String name;
    String id;
    String address;

    public Student(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
// class NameSorter implements Comparator<Student> {
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.getName().compareToIgnoreCase(o2.getName());
//        //return o1.getName().compareTo(o2.getName());
//
//    }
//}

public class ComparatorExample {
    public static void main(String[] args) {

        List<Student> list = new LinkedList<>();
        list.add(new Student("pnm","123","blr"));
        list.add(new Student("ram","234","madras"));
        list.add(new Student("saz","6246","delhi"));
        list.add(new Student("ali","943","hyd"));
        list.add(new Student("ver","35","cal"));



        System.out.println(list);
        //Method 1-----------------
        // Collections.sort(list,new NameSorter().reversed());

        //Method 2------------------
        //Collections.sort(list,Comparator.comparing(Student::getName));
        //Collections.sort(list,Comparator.comparing(Student::getId).reversed());
        //Collections.sort(list,Comparator.comparing(Student::getAddress));

        //Method 3-------------------
        Collections.sort(list,
                    Comparator.comparing(Student::getName)
                .thenComparing(Student::getId)
                .thenComparing(Student::getAddress));

        //Method 4-------------------
        Comparator<Student> groupedComparator =
                Comparator.comparing(Student::getName)
                        .thenComparing(Student::getId)
                        .thenComparing(Student::getAddress);

        Collections.sort(list,groupedComparator);

        System.out.println(list);

    }

}


