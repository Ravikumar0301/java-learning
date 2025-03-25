package Modifiers.access;

public class Main {
    public static void main(String[] args){
        /* accessing class public access modifier */
        Marks marks = new Marks(86,73,95,93,97);

        /* accessing class default access modifier */
        Student student = new Student("Jhon", 15);

        /* accessing method public access modifier */
        String studentDetails = student.getStudentDeatails();

        /* accessing method default access modifier */
        int tamil = marks.getMarksBySubject("tamil");
        int english = marks.getMarksBySubject("english");
        int maths = marks.getMarksBySubject("maths");
        int science = marks.getMarksBySubject("science");
        int socialScience = marks.getMarksBySubject("socialScience");

        /* accessing method protected access modifier */
        int totalMarks = marks.getTotalMarks();

        /* Output */
        System.out.println("Student Details: ");
        System.out.println(studentDetails);

        System.out.println("Marks By Subject: ");
        System.out.println("Tamil : " + tamil);
        System.out.println("English : " + english);
        System.out.println("Maths : " + maths);
        System.out.println("Science : " + science);
        System.out.println("Social Science : " + socialScience);

        System.out.println("Total Marks: " + totalMarks);

    }
}
