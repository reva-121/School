import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Students S1 = new Students("Reva", 45, 22, "Kannur", 8, 8, 7);
        Students S2 = new Students("Namitha", 35, 22, "Thrissur", 10, 10, 10);
        Students S3 = new Students("Meghna", 30, 23, "Malapuram", 7, 8, 9);
        ArrayList<Students> Class1 = new ArrayList<Students>();
        Class1.add(S1);
        Class1.add(S2);
        Class1.add(S3);
        SchoolClass C1 = new SchoolClass("5th", "Sheeba", 3, Class1);


        Students S4 = new Students("Aedna", 05, 22, "Ernakulam", 9, 9, 7);
        Students S5 = new Students("Sania", 47, 23, "Ernakulam", 7, 8, 6);
        Students S6 = new Students("Fajra", 29, 23, "Ernakulam", 8, 9, 10);
        ArrayList<Students> Class2 = new ArrayList<Students>();
        Class2.add(S4);
        Class2.add(S5);
        Class2.add(S6);
        SchoolClass C2 = new SchoolClass("6th", "Shaija", 3, Class2);
        ArrayList<SchoolClass> School1 = new ArrayList<SchoolClass>();
        School1.add(C1);
        School1.add(C2);
        School Sch1 = new School("Model", "Ernakulam", School1);
        System.out.println(Sch1.schoolAverage());
        System.out.println(S1.average());
        System.out.println(C1.getTopper());
    }

}
