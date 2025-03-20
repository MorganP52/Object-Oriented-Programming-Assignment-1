# Object-Oriented-Programming-Assignment-1

Requirements
1. Class Design and Object-Oriented Principles

    Create a base class Person with attributes:
        String name
        int age
        String address

    Use encapsulation to ensure data is accessed and modified through getter and setter methods.

    Create a subclass Student that extends Person with additional attributes:
        String studentId (auto-generated using a static variable)
        String major
        double GPA

2. Constructors

    Implement parameterized constructors for Person and Student to initialize attributes during object creation.
    Provide a default constructor for the Student class.

3. Methods

    Implement the following methods:
        displayDetails() in both Person and Student to display object details.
        A static method generateStudentId() to auto-increment and assign a unique ID to each student.
        Override displayDetails() in the Student class to include student-specific details.

4. Inheritance

    Reuse code from the Person class in the Student class using inheritance.

5. Real-World Scenario

Simulate a Student Management System where:

    A list of students is stored in an ArrayList.
    The user interacts with a menu system:
        Add a new student.
        Display details of all students.
        Search for a student by ID.
        Exit the program.
