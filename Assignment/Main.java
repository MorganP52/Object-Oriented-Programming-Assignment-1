import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int age;
    String address;
    String course;
    double gpa;

    public Student(String name, int age, String address, String course, double gpa) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.course = course;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address + ", Course: " + course + ", GPA: " + gpa;
    }
}

public class Main {

    private static ArrayList<Student> Students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Add a sample student
        Student s1 = new Student("Morgan", 20, "123 London St", "IT", 1.5);
        Students.add(s1);
        System.out.println(Students);

        int option;
        do {
            System.out.println("\n ---- Student Management System----");
            System.out.println("---- Please enter 1 to add student, 2 to display the details, 3 to search student, or 4 to Quit----");
            option = scanner.nextInt();
            scanner.nextLine();  // To consume the newline character left by nextInt()

            switch (option) {
                case 1: 
                    addStudent();
                    break;
                case 2: 
                    displayStudentDetails();
                    break;
                case 3: 
                    searchStudent();
                    break;
                case 4: 
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("---- Please enter 1 to add student, 2 to display the details, 3 to search student, or 4 to Quit----");
            }
        } while (option != 4);

        System.out.println("----- End of code -----");
    }

    private static void addStudent() {
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter student address: ");
        String address = scanner.nextLine();
        System.out.println("Enter student course: ");
        String course = scanner.nextLine();
        System.out.println("Enter student GPA: ");
        double gpa = scanner.nextDouble();

        Student newStudent = new Student(name, age, address, course, gpa);
        Students.add(newStudent);
        System.out.println("Student added successfully!");
    }

    private static void displayStudentDetails() {
        if (Students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("Student Details:");
            for (Student student : Students) {
                System.out.println(student);
            }
        }
    }

    private static void searchStudent() {
        System.out.println("Enter student name to search: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Student student : Students) {
            if (student.name.equalsIgnoreCase(name)) {
                System.out.println("Student found: " + student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
