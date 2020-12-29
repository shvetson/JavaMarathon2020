package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int markNumber = random.nextInt(5) + 1;
        String markWord = markFromNumberToWord(markNumber);

        System.out.printf("Преподаватель %s оценил(-а) студента с именем %s по предмету %s на оценку %s\n",
                name, student.getName(), subject.toLowerCase(), markWord);
    }

    private String markFromNumberToWord(int markNumber) {
        String markWord = "";
        switch (markNumber) {
            case 1:
            case 2:
                markWord = "неудовлетворительно";
                break;
            case 3:
                markWord = "удовлетворительно";
                break;
            case 4:
                markWord = "хорошо";
                break;
            case 5:
                markWord = "отлично";
                break;
        }
        return markWord;
    }
}