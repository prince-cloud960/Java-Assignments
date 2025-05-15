package assignment;

class Student {
    String name;
    int age;
    char section;
    char gender;
    int subject1, subject2, subject3;
    int totalMarks;
    double percentage;

   
    Student(String name, int age, char section, char gender, int s1, int s2, int s3) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.gender = gender;
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
        calculate();
    }

    
    Student(String name, int age, char section, char gender, int s2, int s3) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.gender = gender;
        this.subject1 = 0; // subject1 not passed
        this.subject2 = s2;
        this.subject3 = s3;
        calculate();
    }

    // Method to calculate total and percentage
    void calculate() {
        totalMarks = subject1 + subject2 + subject3;
        percentage = totalMarks / 3.0;
    }

    // Display method
    void display() {
        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Section: " + section);
        System.out.println("Gender: " + gender);
        System.out.println("Subject 1 Marks: " + subject1);
        System.out.println("Subject 2 Marks: " + subject2);
        System.out.println("Subject 3 Marks: " + subject3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("---------------------------\n");
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        // 4 student objects
        Student s1 = new Student("Ram", 20, 'A', 'M', 80, 85, 90);
        Student s2 = new Student("Shyam", 21, 'B', 'M', 75, 88); // s1 = 0
        Student s3 = new Student("Radha", 22, 'A', 'F', 60, 78); // s1 = 0
        Student s4 = new Student("Gita", 20, 'C', 'F', 70, 80, 90);

        // Display all
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
