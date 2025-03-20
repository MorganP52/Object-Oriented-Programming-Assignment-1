class Student extends Person {
    // Attributes
    private String studentId;
    static int idCounter = 20251000;
    private String major;
    private double GPA;

    // Constructor
    public Student(String name, int age, String address, String major, double GPA) {
        super(name, age, address); // Call the constructor of the Person class
        this.studentId = generateStudentID();  // Generate unique student ID
        this.major = major;  // Set major
        this.GPA = GPA;      // Set GPA
    }

    // Override the displayData method
    @Override
    public void displayData() {
        super.displayData(); // Call the displayData() method of the Person class
        System.out.println("Student ID is: " + studentId);
        System.out.println("Major is: " + major);
        System.out.println("GPA is: " + GPA);
    }


    // Private method to generate unique student ID
    private static String generateStudentID() {
        return "S" + (idCounter++);
    }
}

