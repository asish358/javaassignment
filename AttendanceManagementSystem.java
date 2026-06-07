import java.util.*;

class Student {
    int id;
    String name;
    int presentDays;
    int totalDays;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.presentDays = 0;
        this.totalDays = 0;
    }

    void markAttendance(boolean present) {
        totalDays++;
        if (present) {
            presentDays++;
        }
    }

    double getAttendancePercentage() {
        if (totalDays == 0) return 0;
        return (presentDays * 100.0) / totalDays;
    }

    void display() {
        System.out.printf(
            "ID: %d | Name: %s | Present: %d | Total: %d | Attendance: %.2f%%\n",
            id, name, presentDays, totalDays, getAttendancePercentage()
        );
    }
}

public class AttendanceManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        students.add(new Student(id, name));
        System.out.println("Student Added Successfully!");
    }

    public static Student findStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }

    public static void markAttendance() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\nMark Attendance");
        for (Student s : students) {
            System.out.print("Is " + s.name + " present? (Y/N): ");
            char choice = sc.next().toUpperCase().charAt(0);

            if (choice == 'Y')
                s.markAttendance(true);
            else
                s.markAttendance(false);
        }

        System.out.println("Attendance Marked Successfully!");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n----- Student Records -----");
        for (Student s : students) {
            s.display();
        }
    }

    public static void searchStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        Student s = findStudent(id);

        if (s != null) {
            s.display();
        } else {
            System.out.println("Student Not Found!");
        }
    }

    public static void attendanceReport() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n===== Attendance Report =====");
        for (Student s : students) {
            s.display();

            if (s.getAttendancePercentage() < 75) {
                System.out.println("Status: Short Attendance");
            } else {
                System.out.println("Status: Eligible");
            }
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n====== Smart Attendance Management System ======");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View All Students");
            System.out.println("4. Search Student");
            System.out.println("5. Attendance Report");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    markAttendance();
                    break;

                case 3:
                    viewStudents();
                    break;

                case 4:
                    searchStudent();
                    break;

                case 5:
                    attendanceReport();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
