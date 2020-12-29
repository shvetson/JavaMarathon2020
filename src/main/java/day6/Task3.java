package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петрова", "Математика");
        Student student = new Student("Иванов");

        teacher.evaluate(student);
    }
}