
class Student {
    String name;
    int age;

    // Constructor
    Student() {
        name = "Satyam";
        age = 20;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s2 = new Student();

        s2.display();
    }
}
