import java.util.Scanner;

public class Teacher {
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    Student[] students = new Student[3];
    void informations(){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
            System.out.println(students[i].age);
            System.out.println(students[i].getLess());
        }
    }
    void Less() {
        for (int i = 0; i < students.length; i++) {
            students[i].setLess(scanner.nextInt());
        }
    }

    void RecordingInformation(String name, int age) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].Age(age));
            System.out.println(students[i].Name(name));
        }
    }
    String Name(String Name) {
        name = Name;
        return name;
    }
    int Age(int Age) {
        age = Age;
        return age;
    }
}
