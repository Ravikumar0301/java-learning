package Modifiers.access;

//class modifier --> default
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getStudentDeatails() {
        return "Name: " + name + " age: " + age;
    }
}
