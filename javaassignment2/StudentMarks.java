import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int marks[] = new int[5];
    //  calculate total marks
    int calculateTotal() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }
    //  calculate average
    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }
    // to get grade based on average
    String getGrade() {
        double avg = calculateAverage();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 75) {
            return "B";
        } else if (avg >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Create array of 3 students
        Student students[] = new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Roll Number: ");
            students[i].rollNumber = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            students[i].name = sc.nextLine();
            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                students[i].marks[j] = sc.nextInt();
            }
        }
        // print statment
        System.out.println("\n--- Student Results ---");
        for (Student s : students) {
            int total = s.calculateTotal();
            double average = s.calculateAverage();
            String grade = s.getGrade();

            System.out.println("\nName: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}
