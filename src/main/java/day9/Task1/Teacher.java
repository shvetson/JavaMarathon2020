package day9.Task1;

import day9.Task1.Human;

public class Teacher extends Human {
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Этот преподаватель с именем %s\n", getName());
    }
}