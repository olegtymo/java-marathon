package org.example;

public class Student extends Human {
    private String group;

    public Student(String name, String group){
        super(name);
        this.group = group;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
