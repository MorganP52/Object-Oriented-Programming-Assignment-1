class Person {

    // attributes
    private String name;
    private int age;
    private String address;

    // Constructor to initialize the attributes
    public Person(String name, int age, String address) {
        this.name = name; // Initialize with the parameter passed
        this.age = age; // Initialize with the parameter passed
        this.address = address; // Initialize with the parameter passed
    }

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    // Getter and Setter for 'age'
    public int getAge() {
        return age;
    }

    public void setAge(int userAge) {
        this.age = userAge;
    }

    // Getter and Setter for 'address'
    public String getAddress() {
        return address;
    }

    public void setAddress(String userAddress) {
        this.address = userAddress;
    }

    // Method to display data
    public void displayData() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Address is: " + address);
    }
}
