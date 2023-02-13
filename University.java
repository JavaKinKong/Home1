import java.util.Scanner;

public class University {
    Scanner scanner = new Scanner(System.in);
    Teacher[] teacher = new Teacher[3];

    void employment() {
        for (int i = 0; i < teacher.length; i++) {
            teacher[i].Name(scanner.nextLine());
            teacher[i].Age(scanner.nextInt());
            teacher[i].RecordingInformation(scanner.nextLine(), scanner.nextInt());
        }
    }
}
