package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Мариванна", "Музыка");
        Student student1 = new Student("Альфред");
        teacher1.evaluate(student1);

    }
}

class Teacher {
    private String name;
    private String predmet;


    void evaluate(Student student) {
        Random rnd = new Random();
        int i = rnd.nextInt(3) + 2;
        String s="";
        switch (i) {

            case 2:
                s = "Неудовлетворительно";
                break;
            case 3:
                s = "Удовлетворительно";
                break;
            case 4:
                s = "Хорошо";
                break;
            case 5:
                s = "Отлично";
                break;

        }

        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + getPredmet() + " на оценку " + s);
    }

    public void setName(String teacherName) {
        name = teacherName;
    }

    public String getName() {
        return name;
    }

    public void setPredmet(String myPredmet) {
        predmet = myPredmet;
    }

    public String getPredmet() {
        return predmet;
    }

    public Teacher(String name, String predmet) {
        this.name = name;
        this.predmet = predmet;
    }

}

class Student {
    private String name;

    public void setName(String studentName) {
        name = studentName;
    }

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }

}
