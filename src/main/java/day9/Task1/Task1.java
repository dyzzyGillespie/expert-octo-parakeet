package day9.Task1;

import day9.Student;
import day9.Teacher;

public class Task1 {
    public static void main(String[] args) {
        Student student=new Student("Ted","group1");
        Teacher teacher=new Teacher("miss Petrenko","informatika");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();

    }
}
