package bbosavictorpius.vupay;

import java.util.Scanner;

public class VUCourses {

    public static void main(String[] args) {

        String moduleCode;
        String courseName;
        int tuition;

        Scanner input = new Scanner(System.in);

        System.out.println("===== Welcome to VUPay =====");
        System.out.print("Enter Module Code: ");
        moduleCode = input.nextLine().toUpperCase();

        if (moduleCode.equals("BSF")) {
            courseName = "BSc. Software Engineering";
            tuition = 900000;
            System.out.println("Course: " + courseName);
            System.out.println("Tuition: UGX " + tuition);
        } else if (moduleCode.equals("BIT")) {
            courseName = "BSc. Information Technology";
            tuition = 750000;
            System.out.println("Course: " + courseName);
            System.out.println("Tuition: UGX " + tuition);
        } else if (moduleCode.equals("BCS")) {
            courseName = "BSc. Computer Science";
            tuition = 800000;
            System.out.println("Course: " + courseName);
            System.out.println("Tuition: UGX " + tuition);
        } else if (moduleCode.equals("BCE")) {
            courseName = "BSc. Computer Engineering";
            tuition = 950000;
            System.out.println("Course: " + courseName);
            System.out.println("Tuition: UGX " + tuition);
        } else {
            System.out.println("Wrong Module Code details");
        }

        input.close();
    }
}
