// All Contests  CSE310_21482_Day25  16921-w5-p1

import java.util.Scanner;

class Student {
    private String name;
    private int registrationNo;

    public Student(String name, int registrationNo) {
        this.name = name;
        this.registrationNo = registrationNo;
    }

    public void show() {
        System.out.println(name + "," + registrationNo);
    }
}

 class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(null, 0);

        while (true) {
            // System.out.println("Enter your choice:");
            // System.out.println("1. Enter student details");
            // System.out.println("2. Display default student details");
            // System.out.println("3. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                // System.out.println("Enter name:");
                String name = sc.next();

                int registrationNo;
                do {
                    // System.out.println("Enter registration number:");
                    registrationNo = sc.nextInt();
                } while (registrationNo < 0);

                student = new Student(name, registrationNo);
            } else if (choice == 2) {
                student.show();
            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Wrong Choice");
            }
        }
    }
}
