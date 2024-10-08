package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Rayan", "501-RO");
        Teacher teacher = new Teacher("Silvia","English");

        student.printInfo();
        teacher.printInfo();
    }
}