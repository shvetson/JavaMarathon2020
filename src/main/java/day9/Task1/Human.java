package day9.Task1;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo(){
        System.out.printf("Этот человек с именем %s\n", name);
    }
}