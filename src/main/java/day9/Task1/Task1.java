package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иванов", "а201");
        Teacher teacher = new Teacher("Петров", "Физика");
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Предмет: " + teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}