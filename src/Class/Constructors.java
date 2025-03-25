package Class;

public class Constructors {
    String name;
    int age;

    /* constructor */
    public Constructors(String name, Integer age) {
        /* set the initial value of attributes */
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        /* create an object of class construnctors (this will call the constructor) */
        Constructors myClass = new Constructors("Ravikumar", 28);

        /* print the attributes values of Constructor class */
        System.out.println("name : " + myClass.name);
        System.out.println("age : " + myClass.age);
    }

}
